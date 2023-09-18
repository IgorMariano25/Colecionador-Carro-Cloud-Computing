package br.com.colecionador.api_carros.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
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
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}