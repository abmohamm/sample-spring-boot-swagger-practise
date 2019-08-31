package com.app.springboot.swagger.samples.springbootswaggerservices;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringbootSwaggerServicesApplication.
 */
@SpringBootApplication
@EnableSwagger2
public class SpringbootSwaggerServicesApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwaggerServicesApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		//return a prepated Docket
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.app.springboot.swagger"))
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"Contact API",
				"Sample API for micro-services Swagger Tutorial",
				"1.0",
				"Free to use",
				new Contact("Abid Mohd", "test_url", "abid3022@gmail.com"),
				"API License",
				"test_website",
				Collections.emptyList());
	}
}
