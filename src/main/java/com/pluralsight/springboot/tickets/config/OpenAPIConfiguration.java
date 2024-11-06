package com.pluralsight.springboot.tickets.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defineOpenAPI() {
        Server server = new Server();
        server.setUrl("http://localhost:8081");
        server.description("Development");

        Contact myContact = new Contact();
        myContact.setName("Mariano Frias");
        myContact.setEmail("frias.mariano@gmail.com");

        Info information = new Info()
                .title("Ticket Management System API")
                .version("1.0")
                .description("This API exposes endpoints to manage tickets.")
                .contact(myContact);

        return new OpenAPI().info(information).servers(List.of(server));
    }
}
