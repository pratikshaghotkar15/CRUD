package com.crud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfiguration {
	

	@Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("CRUD API")
	              .description("CRUD Operations")
	              .version("v0.0.1")
	              .license(new License().name("Apache 2.0").url("http://crudapidoc.org")))
	              .externalDocs(new ExternalDocumentation()
	              .description("CRUD API Documentation")
	              .url("https://crudapidoc.wiki.github.org/docs"));
	  }

}
