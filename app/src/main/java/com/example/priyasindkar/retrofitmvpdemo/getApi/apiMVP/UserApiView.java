package com.example.priyasindkar.retrofitmvpdemo.getApi.apiMVP;

import com.example.priyasindkar.retrofitmvpdemo.getApi.Model.User;

import java.util.ArrayList;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public interface UserApiView {
    void showProgressBar();
    void hideProgressBar();
    void onSuccess(ArrayList<User> users);
    void onError();
}
