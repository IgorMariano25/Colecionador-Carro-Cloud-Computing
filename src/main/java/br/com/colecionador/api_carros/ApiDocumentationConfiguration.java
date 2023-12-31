package br.com.colecionador.api_carros;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
    
@Configuration
public class ApiDocumentationConfiguration { 

    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("API - Colecionador de Carros")
                        .description("API criada para a apresetanção da AP1 no Ibmec - Rio de Janeiro")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Igor Marino")
                                .email("teste@teste.com.br")));
    }
}
