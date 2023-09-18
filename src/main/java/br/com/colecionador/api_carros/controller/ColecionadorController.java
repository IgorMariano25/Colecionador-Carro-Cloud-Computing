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

import br.com.colecionador.api_carros.model.Colecionador;;

@RestController
@RequestMapping("/colecionador")
public class ColecionadorController {

    @GetMapping
    public ResponseEntity<List<Colecionador>> getAll() {
        try {
            List<Colecionador> items = new ArrayList<Colecionador>();
            Colecionador colecionador = new Colecionador();
            colecionador.setNome("Igor");
            colecionador.setSobrenome("Mariano");
            colecionador.setNickname("DK");
            colecionador.setCpf("123.456.789.00");
            colecionador.setEmail("teste@teste.com");

            items.add(colecionador);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}