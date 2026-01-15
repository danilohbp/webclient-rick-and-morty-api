package com.example.webclient_rick_and_morty_api.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class EpisodeResponse {

    private String id;
    private String name;
    private String air_date;
    private String episode;
    private List<String> episodes;
    private String url;

}
