package com.example.soundtracks.datasources;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class SpotifyClient {

    private static final String SPOTIFY_API_URL = "https://spotify-demo-api-fe224840a08c.herokuapp.com/v1";
    private final RestClient client = RestClient.builder().baseUrl(SPOTIFY_API_URL).build();
}

