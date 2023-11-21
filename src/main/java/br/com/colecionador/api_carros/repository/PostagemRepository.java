package br.com.colecionador.api_carros.repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.colecionador.api_carros.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
    Optional<Postagem> findById(Long postagemId);
    List<Postagem> findAllByUsuarioId(Long usuarioId);
}
