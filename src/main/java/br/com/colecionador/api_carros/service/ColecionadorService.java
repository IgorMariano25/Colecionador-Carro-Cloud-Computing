package br.com.colecionador.api_carros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.colecionador.api_carros.model.Colecionador;
import br.com.colecionador.api_carros.repository.ColecionadorRepository;

@Service
public class ColecionadorService {

    @Autowired
    private ColecionadorRepository colecionadorRepository;

    public List<Colecionador> findAll() {
        return this.colecionadorRepository.findAll();
    }

    public Optional<Colecionador> findById(Long id) {
        return this.colecionadorRepository.findById(id);
    }

    public Colecionador save(Colecionador colecionador) throws Exception {
        if (this.colecionadorRepository.findById(colecionador.getId()).isPresent() == true) {
            throw new Exception("Esse cpf já existe na base de dados");
        }
        this.colecionadorRepository.save(colecionador);
        return colecionador;
    }

    public Colecionador update(Long id, Colecionador colecionadorNovosDados) throws Exception {
        Optional<Colecionador> result = this.colecionadorRepository.findById(id);
        if (result.isPresent() == false) {
            throw new Exception("Não encontreio o colecionador a ser atualizado na base de dados");
        }

        Colecionador colecionadorASerAtualizado = result.get();
        colecionadorASerAtualizado.setEmail(colecionadorNovosDados.getEmail());
        colecionadorASerAtualizado.setNickname(colecionadorNovosDados.getNickname());

        this.colecionadorRepository.save(colecionadorASerAtualizado);
        return colecionadorASerAtualizado;
    }

    public void delete(Long id) throws Exception {
        Optional<Colecionador> colecionadorASerExcluido = this.colecionadorRepository.findById(id);

        if (colecionadorASerExcluido.isPresent() == false) {
            throw new Exception("Não encontrei o colecionador a ser excluido");
        }
        this.colecionadorRepository.delete(colecionadorASerExcluido.get());
    }

    public void saveEndereco(Colecionador colecionador) {
        this.colecionadorRepository.save(colecionador);
    }
    public void saveCarro(Colecionador colecionador) {
        this.colecionadorRepository.save(colecionador);
    }
}
