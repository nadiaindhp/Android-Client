package com.example.android_client;

public class User {
    private int id;
    private String name;
    private String email;
    private String hobi;
    private String alamat;

    public User(int id, String name, String email, String hobi, String alamat) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.hobi = hobi;
        this.alamat = alamat;
    }

    public User(String name, String email, String hobi, String alamat) {
        this.name = name;
        this.email = email;
        this.hobi = hobi;
        this.alamat = alamat;
    }


    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi){
        this.hobi=hobi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
}

