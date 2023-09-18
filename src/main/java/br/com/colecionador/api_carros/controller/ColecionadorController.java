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
import br.com.colecionador.api_carros.model.Colecionador;

@RestController
@RequestMapping("/colecionador")
public class ColecionadorController {

    private static ArrayList<Colecionador> Colecionadores = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Colecionador>> getAll() {
        try {
            return new ResponseEntity<>(Colecionadores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Colecionador> create(@RequestBody Colecionador item) {
        try {
            Colecionadores.add(item);
            return new ResponseEntity<>(item, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Colecionador> getById(@PathVariable("id") Integer id) {

        Colecionador result = null;

        for (Colecionador item : Colecionadores) {
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
}