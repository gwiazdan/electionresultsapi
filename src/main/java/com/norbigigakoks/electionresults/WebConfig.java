package com.norbigigakoks.electionresults;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:5173")
                .allowedOrigins("http://localhost:5173") // Zezwól na żądania z Reacta
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Zezwól na odpowiednie metody HTTP
                .allowedHeaders("*") // Zezwól na wszystkie nagłówki
                .allowCredentials(true);
    }
}
