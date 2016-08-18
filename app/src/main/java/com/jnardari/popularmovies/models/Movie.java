package com.jnardari.popularmovies.models;

/**
 * Created by jnardari on 15/08/16.
 */
public class Movie {

    String poster_path;
    boolean adult;
    String overview;
    String release_date;
    int[] genre_ids;
    long id;
    String original_title;
    String original_language;
    String title;
    String backdrop_path;
    double popularity;
    int vote_count;
    boolean video;
    float vote_average;

    public void getImageUrl() {
        String url = "http://image.tmdb.org/t/p/w185/" + poster_path;
    }
}
