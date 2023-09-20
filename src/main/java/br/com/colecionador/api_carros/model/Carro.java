package br.com.colecionador.api_carros.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "carros")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "O campo marca não pode ser vazio")
    private String marca;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "O campo modelo não pode ser vazio")
    private String modelo;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "O campo cor não pode ser vazio")
    private String cor;

    @Column(nullable = true, length = 100)
    @NotBlank(message = "O campo ano de fabricação não pode ser vazio")
    private Integer anoDeFabricacao;

    @Column(nullable = false)
    @NotBlank(message = "O campo velocidade máxima não pode ser vazio")
    private Integer velocidadeMaxima;

    @Column(nullable = false)
    @NotBlank(message = "O campo quilometragem não pode ser vazio")
    private Integer quilometragem;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
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

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAnoDeFabricacao() {
        return this.anoDeFabricacao;
    }

    public void setAnoDeFabricacao(Integer anoDeFabricacao) {
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