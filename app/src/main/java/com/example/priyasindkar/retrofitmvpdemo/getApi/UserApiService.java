package com.example.priyasindkar.retrofitmvpdemo.getApi;

import com.example.priyasindkar.retrofitmvpdemo.getApi.Model.contacts;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public interface UserApiService {

    @GET("contacts/")
    Call<contacts> loadUsers();

}