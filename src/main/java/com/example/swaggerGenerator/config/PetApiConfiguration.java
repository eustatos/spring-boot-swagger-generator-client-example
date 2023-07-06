package com.example.swaggerGenerator.config;

import io.swagger.client.api.PetApi;
import org.springframework.context.annotation.Bean;

public class PetApiConfiguration {
    @Bean
    public PetApi petApi() {
        return new PetApi();
    }
}
