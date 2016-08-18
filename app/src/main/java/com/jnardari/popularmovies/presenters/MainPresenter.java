package com.jnardari.popularmovies.presenters;

/**
 * Created by jnardari on 15/08/16.
 */
public interface MainPresenter {

    void onResume();

    void onMovieClicked(int position);

    void onDestroy();

}
