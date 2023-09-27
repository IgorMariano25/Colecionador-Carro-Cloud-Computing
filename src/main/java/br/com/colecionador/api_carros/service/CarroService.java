package br.com.colecionador.api_carros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.colecionador.api_carros.model.Carro;
import br.com.colecionador.api_carros.repository.CarroRepsoitory;

@Service
public class CarroService {
    @Autowired
    private CarroRepsoitory _carroRepsoitory;

    public List<Carro> findAll() {
        return this._carroRepsoitory.findAll();
    }

    public Optional<Carro> findById(Long id) {
        return this._carroRepsoitory.findById(id);
    }

    public Carro save(Carro carro) throws Exception {
        if (this._carroRepsoitory.findById(carro.getId()).isPresent() == false) {
            throw new Exception("Esse ID já existe na base de dados na tabela Carro");
        }
        this._carroRepsoitory.save(carro);
        return carro;
    }

    public Carro update(Long id, Carro carroNovosDados) throws Exception {
        Optional<Carro> existingItemOptional = _carroRepsoitory.findById(id);

        if (existingItemOptional.isPresent() == false) {
            throw new Exception("Não encontreio o carro a ser atualizado na base de dados na tabela Carro");
        }

        Carro carroASerAtualizado = existingItemOptional.get();

        carroASerAtualizado.setCor(carroNovosDados.getCor());
        carroASerAtualizado.setQuilometragem(carroNovosDados.getQuilometragem());

        this._carroRepsoitory.save(carroASerAtualizado);

        return carroASerAtualizado;
    }

    public void delete(Long id) throws Exception {
        Optional<Carro> carroASerExcluido = this._carroRepsoitory.findById(id);

        if (carroASerExcluido.isPresent() == false) {
            throw new Exception("Não encontrei o carro a ser excluído na base de dados na tabela Carro");
        }
        this._carroRepsoitory.delete(carroASerExcluido.get());
    }

    public void saveCarro(Carro carro) {
        this._carroRepsoitory.save(carro);
    }
}
