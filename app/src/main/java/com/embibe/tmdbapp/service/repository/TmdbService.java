package com.embibe.tmdbapp.service.repository;

import com.embibe.tmdbapp.service.models.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TmdbService {

    @GET("movie/now_playing")
    Call<List<Movie>> getNowPlayingList(@Query("api_key") String apiKey, @Query("page") String page);

    @GET("search/movie")
    void searchMovie(@Query("api_key") String api_key, @Query("query") String query, @Query("page") Integer page);

}
