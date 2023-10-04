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

import br.com.colecionador.api_carros.model.Colecionador;
import br.com.colecionador.api_carros.service.ColecionadorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@Tag(name = "Colecionador", description = "Resquições para a tabela Colecionador")
@RequestMapping("/colecionador")
public class ColecionadorController {

    @Autowired
    private ColecionadorService _colecionadorService;

    @GetMapping
    @Operation(summary = "Buscando todos os colecionadores", method = "GET")
    public ResponseEntity<List<Colecionador>> getAll() {
        try {
            return new ResponseEntity<>(this._colecionadorService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    @Operation(summary = "Adicionando um colecionador", method = "POST")
    public ResponseEntity<Colecionador> create(@Valid @RequestBody Colecionador item) {
        try {
            Colecionador result = this._colecionadorService.save(item);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @GetMapping("{id}")
    @Operation(summary = "Buscando um colecionador pelo ID", method = "GET")
    public ResponseEntity<Colecionador> getById(@PathVariable("id") Long id) {

        Optional<Colecionador> result = this._colecionadorService.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("{id}")
    @Operation(summary = "Alterando informações do colecionador pelo ID", method = "PUT")
    public ResponseEntity<Colecionador> update(@PathVariable("id") Long id,
            @RequestBody Colecionador colecionadorNovosDados) {
        try {
            Colecionador result = this._colecionadorService.update(id, colecionadorNovosDados);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Deletando um colecionador pelo ID", method = "DELETE")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        try {
            Optional<Colecionador> colecionadorASerExcluido = this._colecionadorService.findById(id);

            if (colecionadorASerExcluido.isPresent() == false) {
                throw new Exception("Não encontrei o colecionador a ser excluído");
            }

            this._colecionadorService.delete(colecionadorASerExcluido.get().getId());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}