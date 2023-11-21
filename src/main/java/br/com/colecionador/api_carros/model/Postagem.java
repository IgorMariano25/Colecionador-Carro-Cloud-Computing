package br.com.colecionador.api_carros.model;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Postagem")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postagemId;

    @Column(name = "conteudoPost", nullable = false, length = 100)
    private String conteudoPost;

    @Column(name = "urlImagem", nullable = false)
    private String imagem;

    @Column(name = "dataDaPublicacao", nullable = false)
    private LocalDateTime dataHoraPublicacao;

    @JsonIgnore
    @Column(name = "colecionador_id")
    private Long colecionadorId;

    public Long getPostagemId() {
        return this.postagemId;
    }

    public void setPostagemId(Long postagemId) {
        this.postagemId = postagemId;
    }

    public String getConteudoPost() {
        return this.conteudoPost;
    }

    public void setConteudoPost(String conteudoPost) {
        this.conteudoPost = conteudoPost;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public LocalDateTime getDataHoraPublicacao() {
        return this.dataHoraPublicacao;
    }

    public void setDataHoraPublicacao(LocalDateTime dataHoraPublicacao) {
        this.dataHoraPublicacao = dataHoraPublicacao;
    }

    public Long getColecionadorId() {
        return this.colecionadorId;
    }

    public void setColecionadorId(Long colecionadorId) {
        this.colecionadorId = colecionadorId;
    }

}
