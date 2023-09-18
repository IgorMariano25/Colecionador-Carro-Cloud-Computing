package br.com.colecionador.api_carros.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "colecionadores")
public class Colecionador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "O campo nome não pode ser vazio")
    private String nome;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "O campo nome não pode ser vazio")
    private String sobrenome;

    @Column(nullable = true, length = 100)
    private String nickname;

    @Column(nullable = true)
    @NotBlank(message = "O campo cpf não pode ser vazio")
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}", message = "cpf não está em um formato válido")
    private String cpf;

    @Column(nullable = true)
    @NotBlank(message = "O campo email não pode ser vazio")
    @Email(message = "email não está em um formato valido")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "colecionador_id")
    private List<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "colecionador_id")
    private List<Carro> carros;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Carro> getCarros() {
        return this.carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}