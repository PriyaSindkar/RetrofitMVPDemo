package com.example.priyasindkar.retrofitmvpdemo.postApi.model;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public class SaveCheckinReponse {
    public String message;
    public Description description;

    public SaveCheckinReponse() {
    }

    public SaveCheckinReponse(String message, Description description) {
        this.message = message;
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}

