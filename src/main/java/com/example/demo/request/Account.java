package com.example.demo.request;

public class Account {
    private String email;
    private String pasword;
    private boolean remember;

    public Account() {
    }

    public Account(String email, String pasword, boolean remember) {
        this.email = email;
        this.pasword = pasword;
        this.remember = remember;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }
}
