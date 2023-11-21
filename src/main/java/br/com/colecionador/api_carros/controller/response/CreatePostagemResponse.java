package br.com.colecionador.api_carros.controller.response;

import java.time.LocalDateTime;

public class CreatePostagemResponse {

    private Long postagemId;
    private Long usuarioId;
    private String conteudoPost;
    private String imagem;
    private LocalDateTime dataHoraPublicacao;

    public Long getPostagemId() {
        return this.postagemId;
    }

    public void setPostagemId(Long postagemId) {
        this.postagemId = postagemId;
    }

    public Long getUsuarioId() {
        return this.usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
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
}
