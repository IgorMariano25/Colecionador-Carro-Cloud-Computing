package br.com.colecionador.api_carros.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

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

    @Column(nullable = true)
    @NotBlank(message = "O campo quilometragem não pode ser vazio")
    private Long quilometragem;
}
