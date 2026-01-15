package com.example.webclient_rick_and_morty_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient rickAndMortyWebClient(WebClient.Builder builder) {
        return builder
                .baseUrl("https://rickandmortyapi.com/api")
                .build();
    }

    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
