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

import br.com.colecionador.api_carros.model.Endereco;
import br.com.colecionador.api_carros.repository.EnderecoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository _enderecoRepository;

    @GetMapping
    public ResponseEntity<List<Endereco>> getAll() {
        try {
            return new ResponseEntity<>(this._enderecoRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Endereco> create(@Valid @RequestBody Endereco item) {
        try {
            Endereco result = this._enderecoRepository.save(item);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Endereco> getById(@PathVariable("id") long id) {

        Optional<Endereco> result = this._enderecoRepository.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Endereco> update(@PathVariable("id") long id,
            @RequestBody Endereco enderecoNovosDados) {

        Optional<Endereco> result = this._enderecoRepository.findById(id);

        if (result.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Endereco enderecoASerAtualizado = result.get();
        enderecoASerAtualizado.setLogradouro(enderecoNovosDados.getLogradouro());
        enderecoASerAtualizado.setComplemento(enderecoASerAtualizado.getComplemento());
        enderecoASerAtualizado.setCidade(enderecoASerAtualizado.getCidade());
        enderecoASerAtualizado.setEstado(enderecoASerAtualizado.getEstado());
        enderecoASerAtualizado.setCep(enderecoASerAtualizado.getCep());

        this._enderecoRepository.save(enderecoASerAtualizado);

        return new ResponseEntity<>(result.get(), HttpStatus.OK);
    }
}
