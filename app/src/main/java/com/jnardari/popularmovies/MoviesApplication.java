package com.jnardari.popularmovies;

import android.app.Application;
import android.util.Log;

import com.jnardari.popularmovies.models.MovieDBList;
import com.jnardari.popularmovies.services.MoviesAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by jnardari on 18/08/16.
 */
public class MoviesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /** Instantiate Retrofit **/
        // popular?api_key=[YOUR_API_KEY]
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.themoviedb.org/3/movie/")
                .build();

        MoviesAPI service = retrofit.create(MoviesAPI.class);
        service.getPopularMovies().enqueue(new Callback<MovieDBList>() {
            @Override
            public void onResponse(Call<MovieDBList> call, Response<MovieDBList> response) {
                Log.i("PopularMovies", "Total Results: " + response.body().total_results);
            }

            @Override
            public void onFailure(Call<MovieDBList> call, Throwable t) {
                Log.i("PopularMovies", "Fail " + t.getMessage());
            }
        });
    }


}
