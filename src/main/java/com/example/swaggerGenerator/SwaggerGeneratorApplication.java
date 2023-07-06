package com.example.swaggerGenerator;

import com.example.swaggerGenerator.config.PetApiConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(PetApiConfiguration.class)
public class SwaggerGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerGeneratorApplication.class, args);
	}

}
