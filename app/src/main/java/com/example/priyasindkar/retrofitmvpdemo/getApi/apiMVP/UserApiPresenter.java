package com.example.priyasindkar.retrofitmvpdemo.getApi.apiMVP;

import android.util.Log;

import com.example.priyasindkar.retrofitmvpdemo.getApi.Model.User;
import com.example.priyasindkar.retrofitmvpdemo.getApi.Model.contacts;
import com.example.priyasindkar.retrofitmvpdemo.getApi.UserApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public class UserApiPresenter {
    UserApiView userApiView;

    public UserApiPresenter(UserApiView userApiView) {
        this.userApiView = userApiView;
    }

    public void callGetUserAPI() {
        if (userApiView != null) {
            userApiView.showProgressBar();
        }

        ArrayList<User> contacts = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.androidhive.info/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        UserApiService userApiService = retrofit.create(UserApiService.class);
        Call<contacts> call = userApiService.loadUsers();

        call.enqueue(new Callback<contacts>() {
            @Override
            public void onResponse(Call<contacts> call, Response<contacts> response) {
                Log.e("onResponse", response.body().getContacts().toString());
                ArrayList<User> contacts = new ArrayList<>();
                contacts = response.body().getContacts();
                onSuccess(contacts);
            }

            @Override
            public void onFailure(Call<contacts> call, Throwable t) {
                Log.e("onFailure", t.toString());
                onError();
            }
        });
    }

    private void onSuccess(ArrayList<User> users) {
        if (userApiView != null) {
            userApiView.hideProgressBar();
            userApiView.onSuccess(users);
        }
    }

    private void onError() {
        if (userApiView != null) {
            userApiView.hideProgressBar();
            userApiView.onError();
        }
    }
}
