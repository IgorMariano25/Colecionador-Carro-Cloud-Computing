package br.com.colecionador.api_carros.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.colecionador.api_carros.model.Carro;
import br.com.colecionador.api_carros.service.CarroService;
import br.com.colecionador.api_carros.model.Colecionador;
import br.com.colecionador.api_carros.service.ColecionadorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@Tag(name = "Carro", description = "Resquições para a tabela Carro")
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @Autowired
    private ColecionadorService colecionadorService;

    @GetMapping
    @Operation(summary = "Buscando todos os carros", method = "GET")
    public ResponseEntity<List<Carro>> getAll() {
        try {
            return new ResponseEntity<>(this.carroService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("{idCarro}")
    @Operation(summary = "Buscando carro pelo ID", method = "GET")

    public ResponseEntity<Carro> getById(@PathVariable("idCarro") Long idCarro) {

        Optional<Carro> result = this.carroService.findById(idCarro);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/marca")
    @Operation(summary = "Buscando carros pela marca", method = "GET")
    public ResponseEntity<List<Carro>> getByMarca(@RequestParam("marca") String marca) {
        try {
            List<Carro> carros = this.carroService.findByMarca(marca);
    
            if (carros.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
    
            return new ResponseEntity<>(carros, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/modelo")
    @Operation(summary = "Buscando carros pela modelo", method = "GET")
    public ResponseEntity<List<Carro>> getByModelo(@RequestParam("modelo") String modelo) {
        try {
            List<Carro> carros = this.carroService.findByModelo(modelo);
    
            if (carros.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
    
            return new ResponseEntity<>(carros, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/colecionador/{idColecionador}")
    @Operation(summary = "Adicionando um carro ao colecionador pelo ID", method = "POST")
    public ResponseEntity<Carro> create(@PathVariable("idColecionador") Long idColecionador,
            @Valid @RequestBody Carro carro) {
        try {

            Optional<Colecionador> colecionador = this.colecionadorService.findById(idColecionador);

            if (colecionador.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            colecionador.get().adicionarCarros(carro);
            this.colecionadorService.saveCarro(colecionador.get());

            return new ResponseEntity<>(carro, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @PostMapping("{idCarro}/uploadCarroImage")
    public ResponseEntity<String> uploadCarroImage(@PathVariable("idCarro") Long idCarro,
            @RequestParam("file") MultipartFile file) {
        try {
            carroService.uploadPhotoFileToCarro(file, idCarro);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("{idCarro}")
    @Operation(summary = "Alterando informações do carro pelo ID", method = "GET")

    public ResponseEntity<Carro> update(@PathVariable("idCarro") Long idCarro, @RequestBody Carro carroNovosDados)
            throws Exception {

        Optional<Carro> result = this.carroService.findById(idCarro);

        if (result.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Carro carroASerAtualizado = result.get();
        carroASerAtualizado.setCor(carroNovosDados.getCor());
        carroASerAtualizado.setQuilometragem(carroNovosDados.getQuilometragem());

        this.carroService.save(carroASerAtualizado);

        return new ResponseEntity<>(result.get(), HttpStatus.OK);
    }

    @DeleteMapping("{idCarro}")
    @Operation(summary = "Deletando um carro pelo ID", method = "DELETE")

    public ResponseEntity<HttpStatus> delete(@PathVariable("idCarro") Long idCarro) {
        try {

            Optional<Carro> carroASerExluido = this.carroService.findById(idCarro);

            if (carroASerExluido.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            this.carroService.delete(carroASerExluido.get().getId());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/colecionador/{idColecionador}")
    @Operation(summary = "Buscando todos os carros de um colecionador pelo ID", method = "GET")
    public ResponseEntity<Colecionador> findCarroByColecionadorId(@PathVariable("idColecionador") Long idColecionador) {
        Optional<Colecionador> result = this.colecionadorService.findById(idColecionador);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}