package com.example.homework77.model;

public class OnBoarModel {

    private int image;
    private String title;
    private String string;

    public OnBoarModel(int image, String title,String string){
        this.image = image;
        this.title = title;
        this.string = string;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
    public String getString(){
        return string;
    }
}
