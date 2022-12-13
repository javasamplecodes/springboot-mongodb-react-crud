package com.knf.sibin.dev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfig {

    // Can be accessed via http://localhost:8080/swagger-ui/index.html#

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                // you can customize package
//                .apis(RequestHandlerSelectors.basePackage("com.exceptionly.tutorials.demo.controller"))
                .apis(RequestHandlerSelectors.any())
                // you can customize path
//                .paths(regex("/customer/.*"))
                .paths(PathSelectors.any())
                .build();
    }

}

