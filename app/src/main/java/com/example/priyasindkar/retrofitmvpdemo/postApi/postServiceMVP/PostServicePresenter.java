package com.example.priyasindkar.retrofitmvpdemo.postApi.postServiceMVP;

import android.util.Log;

import com.example.priyasindkar.retrofitmvpdemo.postApi.CheckinApiService;
import com.example.priyasindkar.retrofitmvpdemo.postApi.model.MainData;
import com.example.priyasindkar.retrofitmvpdemo.postApi.model.SaveCheckin;
import com.example.priyasindkar.retrofitmvpdemo.postApi.model.SaveCheckinReponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public class PostServicePresenter {
    private PostServiceView postServiceView;

    public PostServicePresenter(PostServiceView postServiceView) {
        this.postServiceView = postServiceView;
    }

    public void callPostServiceAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://passworld.co/admin/manager/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CheckinApiService checkinApiService = retrofit.create(CheckinApiService.class);
        SaveCheckin saveCheckin = new SaveCheckin();
        saveCheckin.setUser_id("43");
        saveCheckin.setTitle("Checkin Test");
        saveCheckin.setTitle("Checkin Test");
        saveCheckin.setCheckin_date("2016-01-01");
        saveCheckin.setLatitude("22");
        saveCheckin.setLongitude("33");
        saveCheckin.setStart_time("13:55:00");
        saveCheckin.setEnd_time("13:55:00");

        Call<SaveCheckinReponse> call = checkinApiService.getSearchResult(saveCheckin);

        call.enqueue(new Callback<SaveCheckinReponse>() {
            @Override
            public void onResponse(Call<SaveCheckinReponse> call, Response<SaveCheckinReponse> response) {
                Log.e("onResponse", response.body().getDescription().getData().toString());
            }

            @Override
            public void onFailure(Call<SaveCheckinReponse> call, Throwable t) {
                Log.e("onFailure",t.toString());
            }
        });

    }



    private void onSuccess(ArrayList<MainData> users) {
        if (postServiceView != null) {
            postServiceView.hideProgressBar();
            postServiceView.onSuccess(users);
        }
    }

    private void onError() {
        if (postServiceView != null) {
            postServiceView.hideProgressBar();
            postServiceView.onError();
        }
    }
}
