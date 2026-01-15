package com.example.webclient_rick_and_morty_api.client;

import com.example.webclient_rick_and_morty_api.response.CharacterResponse;
import com.example.webclient_rick_and_morty_api.response.EpisodeResponse;
import com.example.webclient_rick_and_morty_api.response.ListOfEpisodesResponse;
import com.example.webclient_rick_and_morty_api.response.LocationResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class RickAndMortyClient {
    private final WebClient webClient;

    public RickAndMortyClient(WebClient rickAndMortyWebClient) {
        webClient = rickAndMortyWebClient;
    }

    public Mono<CharacterResponse> findAndCharacterById(String id) {
        log.info("Buscando o personagem com o id [{}]", id);
        return webClient
                .get()
                .uri("/character/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("Verifique os parâmetros informados!")))
                .bodyToMono(CharacterResponse.class);
    }

    public Mono<LocationResponse> findAndLocationById(String id) {
        log.info("Buscando a localização com o id [{}]", id);
        return webClient
                .get()
                .uri("/location/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("Verifique os parâmetros informados!")))
                .bodyToMono(LocationResponse.class);
    }

    public Mono<EpisodeResponse> findAndEpisodeById(String id) {
        log.info("Buscando o episódio com o id [{}]", id);
        return webClient
                .get()
                .uri("/episode/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("Verifique os parâmetros informados!")))
                .bodyToMono(EpisodeResponse.class);
    }

    public Flux<ListOfEpisodesResponse> getAllEpisodes() {
        log.info("Lista episódios");
        return webClient
                .get()
                .uri("/episode")
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("Verifique os parâmetros informados!")))
                .bodyToFlux(ListOfEpisodesResponse.class);
    }
}
