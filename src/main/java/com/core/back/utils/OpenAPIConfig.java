package com.core.back.utils;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
@OpenAPIDefinition()
public class OpenAPIConfig {
    @Bean
    public OpenAPI configAPI() {

        return new OpenAPI ()
                .info(new Info()
                        .title("Universidad")
                        .description("Mantenimiento de universidades")
                        .version("1.0.0.0")
                        .contact(new Contact()
                                .name("Carlos Aparicio Vivero")
                                .email("carlos.aparicio@ug.edu.ec")
                                .url("cmav.com"))
                        .license(new License()
                                .name("http://www.gnu.org/licenses/gpl.html"))
                        )
                .externalDocs(new ExternalDocumentation()
                        .description("API Rest Secoed")
                        .url(""));
    }
}
