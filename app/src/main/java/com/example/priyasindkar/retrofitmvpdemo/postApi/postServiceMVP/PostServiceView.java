package com.example.priyasindkar.retrofitmvpdemo.postApi.postServiceMVP;

import com.example.priyasindkar.retrofitmvpdemo.postApi.model.MainData;

import java.util.ArrayList;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public interface PostServiceView {
    void showProgressBar();
    void hideProgressBar();
    void onSuccess(ArrayList<MainData> mainData);
    void onError();
}
