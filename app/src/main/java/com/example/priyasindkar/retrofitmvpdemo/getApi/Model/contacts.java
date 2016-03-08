package com.example.priyasindkar.retrofitmvpdemo.getApi.Model;

import java.util.ArrayList;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public class contacts {

    ArrayList<User> contacts;

    public contacts() {
    }

    public contacts(ArrayList<User> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<User> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<User> contacts) {
        this.contacts = contacts;
    }
}
