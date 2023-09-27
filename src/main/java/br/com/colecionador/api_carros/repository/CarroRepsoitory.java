package br.com.colecionador.api_carros.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.colecionador.api_carros.model.Carro;

@Repository
public interface CarroRepsoitory extends JpaRepository<Carro, Long>{
        Optional<Carro> findById(Long id);
}
