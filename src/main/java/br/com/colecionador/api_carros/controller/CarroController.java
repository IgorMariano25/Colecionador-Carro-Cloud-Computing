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
import br.com.colecionador.api_carros.model.Colecionador;
import br.com.colecionador.api_carros.repository.CarroRepsoitory;
import br.com.colecionador.api_carros.repository.ColecionadorRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroRepsoitory _carroRepsoitory;

    @Autowired
    private ColecionadorRepository _colecionadorRepository;

    @GetMapping
    public ResponseEntity<List<Carro>> getAll() {
        try {
            return new ResponseEntity<>(this._carroRepsoitory.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("{idColecionador}")
    public ResponseEntity<Carro> create(@PathVariable("idColecionador") Long idColecionador,
            @Valid @RequestBody Carro carro) {
        try {

            Optional<Colecionador> colecionador = this._colecionadorRepository.findById(idColecionador);

            if (colecionador.isPresent() == false) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            colecionador.get().adicionarCarros(carro);
            this._colecionadorRepository.save(colecionador.get());

            return new ResponseEntity<>(carro, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Carro> getById(@PathVariable("id") Long id) {

        Optional<Carro> result = this._carroRepsoitory.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Carro> update(@PathVariable("id") Long id, @RequestBody Carro carroNovosDados) {

        Optional<Carro> result = this._carroRepsoitory.findById(id);

        if (result.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Carro carroASerAtualizado = result.get();
        carroASerAtualizado.setCor(carroNovosDados.getCor());
        carroASerAtualizado.setQuilometragem(carroNovosDados.getQuilometragem());

        this._carroRepsoitory.save(carroASerAtualizado);

        return new ResponseEntity<>(result.get(), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        try {

            Optional<Carro> carroASerExluido = this._carroRepsoitory.findById(id);

            if (carroASerExluido.isPresent() == false) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            this._carroRepsoitory.delete(carroASerExluido.get());
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
