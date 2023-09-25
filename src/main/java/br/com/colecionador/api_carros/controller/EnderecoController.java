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
import jakarta.validation.Valid;

import br.com.colecionador.api_carros.model.Endereco;
import br.com.colecionador.api_carros.model.Colecionador;
import br.com.colecionador.api_carros.repository.EnderecoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import br.com.colecionador.api_carros.repository.ColecionadorRepository;

@RestController
@Tag(name = "Endereço", description = "Resquições para a tabela Endereco")
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository _enderecoRepository;

    @Autowired
    private ColecionadorRepository _colecionadorRepository;

    @GetMapping
    @Operation(summary = "Buscando todos os endereços", method = "GET")
    public ResponseEntity<List<Endereco>> getAll() {
        try {
            return new ResponseEntity<>(this._enderecoRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("{idColecionador}")
    @Operation(summary = "Adicionando um endereço ao colecionador pelo ID", method = "POST")

    public ResponseEntity<Endereco> create(@PathVariable("idColecionador") Long idColecionador,
            @Valid @RequestBody Endereco endereco) {
        try {

            Optional<Colecionador> colecionador = this._colecionadorRepository.findById(idColecionador);

            if (colecionador.isPresent() == false) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            colecionador.get().addEndereco(endereco);
            this._colecionadorRepository.save(colecionador.get());

            return new ResponseEntity<>(endereco, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @GetMapping("{id}")
    @Operation(summary = "Buscando todos os endereços de um colecionador pelo ID", method = "GET")

    public ResponseEntity<Endereco> getById(@PathVariable("id") Long id) {

        Optional<Endereco> result = this._enderecoRepository.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    @Operation(summary = "Alterando informações do endereço pelo ID", method = "PUT")

    public ResponseEntity<Endereco> update(@PathVariable("id") Long id, @RequestBody Endereco enderecoNovosDados) {

        Optional<Endereco> result = _enderecoRepository.findById(id);

        if (result.isPresent() == false) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Endereco enderecoASerAtualizado = result.get();
        enderecoASerAtualizado.setLogradouro(enderecoNovosDados.getLogradouro());
        enderecoASerAtualizado.setComplemento(enderecoASerAtualizado.getComplemento());
        enderecoASerAtualizado.setCidade(enderecoASerAtualizado.getCidade());
        enderecoASerAtualizado.setEstado(enderecoASerAtualizado.getEstado());
        enderecoASerAtualizado.setCep(enderecoASerAtualizado.getCep());

        this._enderecoRepository.save(enderecoASerAtualizado);

        return new ResponseEntity<>(enderecoASerAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Deletando um endereço pelo ID", method = "DELETE")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        try {

            Optional<Endereco> enderecoASerExcluido = this._enderecoRepository.findById(id);

            if (enderecoASerExcluido.isPresent() == false) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            this._enderecoRepository.delete(enderecoASerExcluido.get());

            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
