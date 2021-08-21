package com.springboot.microservices.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	@Bean
	public Docket api() {
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("SpringBoot MVP Sample")
				.description("SpringBoot MVP Sample")
				.version("1.0.0")
				.build();
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.springboot.microservices.sample.ctrl"))
				.paths(PathSelectors.any())
				.build();		
	}
}

