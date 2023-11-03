package com.example.myapplication;

import androidx.lifecycle.ViewModel;

import java.io.Serializable;

public class SharedViewModel extends ViewModel implements Serializable {
    private String userData;

    public String getUserData() {
        return userData;
    }

    public void setUserData(String data) {
        userData = data;
    }
}
