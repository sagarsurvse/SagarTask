package com.example.sony.sagartask.network.api;

import com.example.sony.sagartask.network.model.SearchResultModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 *  Created by Sagar on 18/04/20.
 */
public interface SearchService {

    String ENTITY_TYPE_MUSIC_TRACK = "musicTrack";

    @GET("search")
    Call<SearchResultModel> getSearchResults(
            @Query("term") CharSequence searchTerm,
            @Query("entity") String entityType
    );
}
