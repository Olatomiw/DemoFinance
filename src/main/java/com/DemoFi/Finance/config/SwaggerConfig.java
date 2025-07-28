package com.DemoFi.Finance.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {
    @Value("${online.server}")
    private String server;
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("DemoFi API")
                        .description("DemoFi API, made with Spring Boot.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("DemoFi")
                                .email("Demofi@example.com")
                        )
                        .license(new License()
                                .name("MIT")
                                .url("https://opensource.org/licenses/MIT")
                        )
                )
                .externalDocs(new ExternalDocumentation()
                        .description("DemoFi Documentation")
                        .url("https://github.com/Hackthejobs-Eatnow/eatnow_backend")
                )
                .servers(List.of(
                        new Server().url("http://localhost:8080").description("Localhost"),
                        new Server().url(server).description("Railway")
                ))
                .addSecurityItem(new SecurityRequirement().addList("none"));
    }
}
