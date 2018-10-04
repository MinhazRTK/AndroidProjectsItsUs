package com.batch2.m0nk3y.itsus;

public class AboutUs {
    private int id;
    private String name;
    private String url;
    private int image;

    public AboutUs(int id, String name, String url, int image) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public int getImage() {
        return image;
    }
}
