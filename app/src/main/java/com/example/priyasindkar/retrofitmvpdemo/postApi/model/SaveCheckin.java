package com.example.priyasindkar.retrofitmvpdemo.postApi.model;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public class SaveCheckin {
    private String user_id, title, checkin_date, latitude, longitude, start_time, end_time;

    public SaveCheckin() {
    }

    public SaveCheckin(String user_id, String title, String checkin_date, String latitude, String longitude) {
        this.user_id = user_id;
        this.title = title;
        this.checkin_date = checkin_date;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(String checkin_date) {
        this.checkin_date = checkin_date;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }
}
