package br.com.colecionador.api_carros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.colecionador.api_carros.model.Carro;
import br.com.colecionador.api_carros.model.Colecionador;
import br.com.colecionador.api_carros.repository.CarroRepsoitory;
import br.com.colecionador.api_carros.repository.ColecionadorRepository;

@Service
public class CarroService {
    @Autowired
    private CarroRepsoitory carroRepsoitory;

    @Autowired
    private ColecionadorRepository colecionadorRepsoitory;

    @Autowired
    private AzureStorageAccountService azureStorageAccountService;

    public List<Carro> findAll() {
        return this.carroRepsoitory.findAll();
    }

    public Optional<Carro> findById(Long id) {
        return this.carroRepsoitory.findById(id);
    }
    public List<Carro> findByMarca(String marca) {
        return this.carroRepsoitory.findByMarca(marca);
    }
    public Optional<Colecionador> findCarroByColecionadorId(Long id) {
        return this.colecionadorRepsoitory.findById(id);
    }

    public Carro save(Carro carro) throws Exception {
        if (this.carroRepsoitory.findById(carro.getId()).isEmpty()) {
            throw new Exception("Esse ID já existe na base de dados na tabela Carro");
        }
        this.carroRepsoitory.save(carro);
        return carro;
    }

    public Carro update(Long id, Carro carroNovosDados) throws Exception {
        Optional<Carro> existingItemOptional = carroRepsoitory.findById(id);

        if (existingItemOptional.isEmpty()) {
            throw new Exception("Não encontreio o carro a ser atualizado na base de dados na tabela Carro");
        }

        Carro carroASerAtualizado = existingItemOptional.get();

        carroASerAtualizado.setCor(carroNovosDados.getCor());
        carroASerAtualizado.setQuilometragem(carroNovosDados.getQuilometragem());

        this.carroRepsoitory.save(carroASerAtualizado);

        return carroASerAtualizado;
    }

    public void delete(Long id) throws Exception {
        Optional<Carro> carroASerExcluido = this.carroRepsoitory.findById(id);

        if (carroASerExcluido.isEmpty()) {
            throw new Exception("Não encontrei o carro a ser excluído na base de dados na tabela Carro");
        }
        this.carroRepsoitory.delete(carroASerExcluido.get());
    }

    public void saveCarro(Carro carro) {
        this.carroRepsoitory.save(carro);
    }

    public void uploadPhotoFileToCarro(MultipartFile file, Long id) throws Exception {

        Optional<Carro> opCarro = this.carroRepsoitory.findById(id);

        if (opCarro.isPresent() == false) {
            throw new Exception("Não encontrei o post a ser atualizado");
        }

        Carro carro = opCarro.get();
        String ulrImage = this.azureStorageAccountService.uploadFileToAzure(file);
        carro.setUrlImagemCarro(ulrImage);
        this.carroRepsoitory.save(carro);
    }
}
