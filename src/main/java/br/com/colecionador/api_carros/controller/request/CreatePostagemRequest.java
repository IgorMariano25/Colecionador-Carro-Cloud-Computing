package br.com.colecionador.api_carros.controller.request;

import java.time.LocalDateTime;
public class CreatePostagemRequest {

    private Long postagemId;
    private String conteudoPost;
    private String imagem;
    private LocalDateTime dataHoraPublicacao;

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
}
