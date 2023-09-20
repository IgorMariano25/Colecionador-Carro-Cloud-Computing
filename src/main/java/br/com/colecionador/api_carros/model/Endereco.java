package br.com.colecionador.api_carros.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    @NotBlank(message = "O campo logradouro não pode ser vazio")
    private String logradouro;

    @Column(length = 200, nullable = false)
    @NotBlank(message = "O campo complemento não pode ser vazio")
    private String complemento;

    @Column(length = 200, nullable = false)
    @NotBlank(message = "O campo cidade não pode ser vazio")
    private String cidade;

    @Column(length = 100, nullable = false)
    @NotBlank(message = "O campo estado não pode ser vazio")
    private String estado;

    @Column(length = 100, nullable = false)
    @NotBlank(message = "O campo cep não pode ser vazio")
    @Pattern(regexp = "\\d{5}\\-\\d{3}", message = "cpf não está em um formato válido")
    private String cep;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}