package br.com.colecionador.api_carros.controller;

import java.util.ArrayList;
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
import br.com.colecionador.api_carros.repository.CarroRepsoitory;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroRepsoitory _carroRepsoitory;

    @GetMapping
    public ResponseEntity<List<Carro>> getAll() {
        try {
            return new ResponseEntity<>(this._carroRepsoitory.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Carro> create(@Valid @RequestBody Carro item) {
        try {
            Carro result = this._carroRepsoitory.save(item);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Carro> getById(@PathVariable("id") Integer id) {

        Carro result = null;

        for (Carro item : Carros) {
            if (item.getId() == id) {
                result = item;
                break;
            }
        }

        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Carro> update(@PathVariable("id") Integer id, @RequestBody Carro carroNovosDados) {

        Carro carroAserAtualizado = null;

        for (Carro item : Carros) {
            if (item.getId() == id) {
                carroAserAtualizado = item;
                break;
            }
        }

        if (carroAserAtualizado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        carroAserAtualizado.setMarca(carroNovosDados.getMarca());
        carroAserAtualizado.setModelo(carroNovosDados.getModelo());
        carroAserAtualizado.setCor(carroNovosDados.getCor());

        return new ResponseEntity<>(carroAserAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Integer id) {
        try {

            Carro carroASerExluido = null;

            for (Carro item : Carros) {
                if (item.getId() == id) {
                    carroASerExluido = item;
                    break;
                }
            }

            if (carroASerExluido == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            Carros.remove(carroASerExluido);
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
