package br.com.colecionador.api_carros.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false)
    @NotBlank(message = "O campo marca não pode ser vazio")
    private String marca;

    @Column(nullable = false)
    @NotBlank(message = "O campo modelo não pode ser vazio")
    private String modelo;

    @Column(nullable = true)
    @NotBlank(message = "O campo ano de fabricação não pode ser vazio")
    private String anoDeFabricacao;

    @Column(nullable = false)
    @NotBlank(message = "O campo velocidade máxima não pode ser vazio")
    private Integer velocidadeMaxima;

    @Column(nullable = false)
    @NotBlank(message = "O campo quilometragem não pode ser vazio")
    private Integer quilometragem;
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoDeFabricacao() {
        return this.anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public Integer getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Integer getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }
}