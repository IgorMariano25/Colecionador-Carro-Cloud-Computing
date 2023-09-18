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

@RestController
@RequestMapping("/carro")
public class CarroController {

    @GetMapping
    public ResponseEntity<List<Carro>> getAll() {
        try {
            List<Carro> items = new ArrayList<Carro>();
            Carro carro = new Carro();
            carro.setMarca("Ferrai");
            carro.setModelo("458");
            carro.setAnoDeFabricacao("2015");
            carro.setVelocidadeMaxima(325);
            carro.setQuilometragem(1000);

            items.add(carro);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}