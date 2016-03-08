package com.example.priyasindkar.retrofitmvpdemo.postApi.model;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public class MainData {
    private Data mData;

    public MainData(Data mData) {
        this.mData = mData;
    }

    public MainData() {
    }

    public Data getmData() {
        return mData;
    }

    public void setmData(Data mData) {
        this.mData = mData;
    }
}
