package br.com.colecionador.api_carros.model;


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
