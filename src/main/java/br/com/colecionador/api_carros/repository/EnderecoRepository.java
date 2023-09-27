package br.com.colecionador.api_carros.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.colecionador.api_carros.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
   Optional<Endereco> findById(Long id);
}
