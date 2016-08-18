package com.jnardari.popularmovies.interactors;

import com.jnardari.popularmovies.models.Movie;

import java.util.List;

/**
 * Created by jnardari on 15/08/16.
 */
public interface MovieInteractor {

    interface RequestListener {
        void onSuccess(List<Movie> movies);
        void onError(String error);
    }

    void listMovies(RequestListener listener);
}
