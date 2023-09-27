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
    private ColecionadorRepository _colecionadorRepository;

    public List<Colecionador> findAll() {
        return this._colecionadorRepository.findAll();
    }

    public Optional<Colecionador> findById(Long id) {
        return this._colecionadorRepository.findById(id);
    }

    public Colecionador save(Colecionador colecionador) throws Exception {
        if (this._colecionadorRepository.findByCpf(colecionador.getCpf()) != null) {
            throw new Exception("Esse cpf já existe na base de dados");
        }
        this._colecionadorRepository.save(colecionador);
        return colecionador;
    }

    public Colecionador update(Long id, Colecionador colecionadorNovosDados) throws Exception {
        Optional<Colecionador> result = this._colecionadorRepository.findById(id);
        if (result.isPresent() == false) {
            throw new Exception("Não encontreio o colecionador a ser atualizado na base de dados");
        }

        Colecionador colecionadorASerAtualizado = result.get();
        colecionadorASerAtualizado.setEmail(colecionadorNovosDados.getEmail());
        colecionadorASerAtualizado.setNickname(colecionadorNovosDados.getNickname());

        this._colecionadorRepository.save(colecionadorASerAtualizado);
        return colecionadorASerAtualizado;
    }

    public void delete(Long id) throws Exception {
        Optional<Colecionador> colecionadorASerExcluido = this._colecionadorRepository.findById(id);

        if (colecionadorASerExcluido.isPresent() == false) {
            throw new Exception("Não encontrei o colecionador a ser excluido");
        }
        this._colecionadorRepository.delete(colecionadorASerExcluido.get());
    }

    public void saveEndereco(Colecionador colecionador) {
        this._colecionadorRepository.save(colecionador);
    }
    public void saveCarro(Colecionador colecionador) {
        this._colecionadorRepository.save(colecionador);
    }
}
