package com.jnardari.popularmovies.services;

import com.jnardari.popularmovies.BuildConfig;
import com.jnardari.popularmovies.models.Movie;
import com.jnardari.popularmovies.models.MovieDBList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jnardari on 18/08/16.
 */
public interface MoviesAPI {

    @GET("movie/popular?api_key=" + BuildConfig.MOVIE_DB_KEY)
    Call<MovieDBList> getPopularMovies();

    @GET("movie/top_rated?api_key=" + BuildConfig.MOVIE_DB_KEY)
    Call<MovieDBList> getTopRatedMovies();


}
