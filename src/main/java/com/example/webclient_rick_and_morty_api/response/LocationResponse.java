package com.example.webclient_rick_and_morty_api.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class LocationResponse {
    private String id;
    private String name;
    private String type;
    private List<String> residents;
    private String url;

}
