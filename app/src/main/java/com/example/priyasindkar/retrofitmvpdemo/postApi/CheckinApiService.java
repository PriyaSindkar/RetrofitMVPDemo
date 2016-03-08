package com.example.priyasindkar.retrofitmvpdemo.postApi;

import com.example.priyasindkar.retrofitmvpdemo.postApi.model.SaveCheckin;
import com.example.priyasindkar.retrofitmvpdemo.postApi.model.SaveCheckinReponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public interface CheckinApiService {

    @POST("checkins/savecheckIn")
    Call<SaveCheckinReponse> getSearchResult(@Body SaveCheckin saveCheckin);
}
