package com.example.myapplication;

import java.io.Serializable;

public class UserModal implements Serializable {
   private String name;
   private  String email;
   private  String phone;
   UserModal(){
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
