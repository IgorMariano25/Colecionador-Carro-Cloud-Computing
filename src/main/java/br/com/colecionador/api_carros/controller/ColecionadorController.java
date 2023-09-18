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

import br.com.colecionador.api_carros.model.Colecionador;
import br.com.colecionador.api_carros.repository.ColecionadorRepository;

@RestController
@RequestMapping("/colecionador")
public class ColecionadorController {

    @Autowired
    private ColecionadorRepository _colecionadorRepository;

    @GetMapping
    public ResponseEntity<List<Colecionador>> getAll() {
        try {
            return new ResponseEntity<>(this._colecionadorRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Colecionador> create(@RequestBody Colecionador item) {
        try {
            Colecionador result = this._colecionadorRepository.save(item);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Colecionador> getById(@PathVariable("id") long id) {

        Optional<Colecionador> result = this._colecionadorRepository.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Colecionador> update(@PathVariable("id") long id,@RequestBody Colecionador colecionadorNovosDados) {

        Optional<Colecionador> result = this._colecionadorRepository.findById(id);

        if (result.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Colecionador colecionadorASerAtualizado = result.get();
        colecionadorASerAtualizado.setEmail(colecionadorNovosDados.getEmail());
        colecionadorASerAtualizado.setNickname(colecionadorNovosDados.getNickname());

        this._colecionadorRepository.save(colecionadorASerAtualizado);

        return new ResponseEntity<>(result.get(), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id) {
        try {

            Colecionador colecionadorASerExluido = null;

            for (Colecionador item : Colecionadores) {
                if (item.getId() == id) {
                    colecionadorASerExluido = item;
                    break;
                }
            }

            if (colecionadorASerExluido == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            Colecionadores.remove(colecionadorASerExluido);
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}