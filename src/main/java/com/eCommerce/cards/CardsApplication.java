package com.eCommerce.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eCommerce.cards.controller") })
@EnableJpaRepositories("com.eCommerce.cards.repository")
@EntityScan("com.eCommerce.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Nipun Dharmarathne",
						email = "nipun@gmail.com",
						url = "https://www.eCommerce.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.eCommerce.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "ECommerce Cards microservice REST API Documentation",
				url = "https://www.eCommerce.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
