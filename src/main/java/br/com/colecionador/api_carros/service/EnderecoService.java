package br.com.colecionador.api_carros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.colecionador.api_carros.model.Endereco;
import br.com.colecionador.api_carros.repository.EnderecoRepository;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository _enderecoRepository;

    public List<Endereco> findAll() {
        return this._enderecoRepository.findAll();
    }

    public Optional<Endereco> findById(Long id) {
        return this._enderecoRepository.findById(id);
    }

    public Endereco save(Endereco endereco) throws Exception {
        if (this._enderecoRepository.findById(endereco.getId()).isPresent() == false) {
            throw new Exception("Esse ID já existe na base de dados");
        }
        this._enderecoRepository.save(endereco);
        return endereco;
    }

    public Endereco update(Long id, Endereco enderecoNovosDados) throws Exception {
        Optional<Endereco> existingItemOptional = _enderecoRepository.findById(id);

        if (existingItemOptional.isPresent() == false) {
            throw new Exception("Não encontreio o endereço a ser atualizado na base de dados");
        }

        Endereco enderecoASerAtualizado = existingItemOptional.get();

        enderecoASerAtualizado.setLogradouro(enderecoNovosDados.getLogradouro());
        enderecoASerAtualizado.setComplemento(enderecoNovosDados.getComplemento());
        enderecoASerAtualizado.setCidade(enderecoNovosDados.getCidade());
        enderecoASerAtualizado.setEstado(enderecoNovosDados.getEstado());
        enderecoASerAtualizado.setCep(enderecoASerAtualizado.getCep());

        this._enderecoRepository.save(enderecoASerAtualizado);

        return enderecoASerAtualizado;
    }

    public void delete(Long id) throws Exception {
        Optional<Endereco> enderecoASerExcluido = this._enderecoRepository.findById(id);

        if (enderecoASerExcluido.isPresent() == false) {
            throw new Exception("Não encontrei o endereço a ser excluído");
        }
        this._enderecoRepository.delete(enderecoASerExcluido.get());
    }

    public void saveEndereco(Endereco endereco) {
        this._enderecoRepository.save(endereco);
    }
}
