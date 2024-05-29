package com.example.android_client;

public class User {
    private int id;
    private String name;
    private String email;
    private String hobi;
    private String alamat;
    public User(String name, String email, String hobi, String alamat) {
        this.name = name;
        this.email = email;
        this.hobi = hobi;
        this.alamat = alamat;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getHobi() { return hobi; }
    public String getAlamat() { return alamat; }
}