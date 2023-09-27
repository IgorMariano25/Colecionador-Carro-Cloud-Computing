package br.com.colecionador.api_carros.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.colecionador.api_carros.model.Carro;
import br.com.colecionador.api_carros.service.CarroService;
import br.com.colecionador.api_carros.model.Colecionador;
import br.com.colecionador.api_carros.service.ColecionadorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@Tag(name = "Carro", description = "Resquições para a tabela Carro")
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService _carroService;

    @Autowired
    private ColecionadorService _colecionadorService;

    @GetMapping
    @Operation(summary = "Buscando todos os carros", method = "GET")
    public ResponseEntity<List<Carro>> getAll() {
        try {
            return new ResponseEntity<>(this._carroService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("{idColecionador}")
    @Operation(summary = "Adicionando um carro ao colecionador pelo ID", method = "POST")
    public ResponseEntity<Carro> create(@PathVariable("idColecionador") Long idColecionador,
            @Valid @RequestBody Carro carro) {
        try {

            Optional<Colecionador> colecionador = this._colecionadorService.findById(idColecionador);

            if (colecionador.isPresent() == false) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            colecionador.get().adicionarCarros(carro);
            this._colecionadorService.saveCarro(colecionador.get());

            return new ResponseEntity<>(carro, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @GetMapping("{id}")
    @Operation(summary = "Buscando todos os carros de um colecionador pelo ID", method = "GET")

    public ResponseEntity<Carro> getById(@PathVariable("id") Long id) {

        Optional<Carro> result = this._carroService.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    @Operation(summary = "Alterando informações do carro pelo ID", method = "GET")

    public ResponseEntity<Carro> update(@PathVariable("id") Long id, @RequestBody Carro carroNovosDados) throws Exception {

        Optional<Carro> result = this._carroService.findById(id);

        if (result.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Carro carroASerAtualizado = result.get();
        carroASerAtualizado.setCor(carroNovosDados.getCor());
        carroASerAtualizado.setQuilometragem(carroNovosDados.getQuilometragem());

        this._carroService.save(carroASerAtualizado);

        return new ResponseEntity<>(result.get(), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
        @Operation(summary = "Deletando um carro pelo ID", method = "DELETE")

    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        try {

            Optional<Carro> carroASerExluido = this._carroService.findById(id);

            if (carroASerExluido.isPresent() == false) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            this._carroService.delete(carroASerExluido.get().getId());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
