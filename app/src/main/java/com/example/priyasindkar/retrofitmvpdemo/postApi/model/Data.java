package com.example.priyasindkar.retrofitmvpdemo.postApi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by priyasindkar on 03-03-2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    public com.example.priyasindkar.retrofitmvpdemo.postApi.model.Checkin Checkin;

    public Data() {
    }

    public com.example.priyasindkar.retrofitmvpdemo.postApi.model.Checkin getCheckinModel() {
        return Checkin;
    }

    public void setCheckinModel(com.example.priyasindkar.retrofitmvpdemo.postApi.model.Checkin Checkin) {
        this.Checkin = Checkin;
    }

    public Data(Checkin checkinModel) {
        this.Checkin = checkinModel;
    }

    @Override
    public String toString() {
        return "Data{" +
                "Checkin=" + Checkin +
                '}';
    }
}
