package br.com.colecionador.api_carros.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.colecionador.api_carros.model.Colecionador;

@Repository
public interface ColecionadorRepository extends JpaRepository<Colecionador, Long>{
    Optional<Colecionador> findById(Long id);
    Long findUsuarioById(Long id);
}
