package br.com.alura.barbearia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/usuarios/**")
            .allowedOrigins("http://127.0.0.1:5501")
            .allowedMethods("POST")
            .allowedHeaders("Content-Type")
            .allowCredentials(true)
            .maxAge(3600);
    }
}