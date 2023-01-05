package com.example.cropscanner;

public class DataModel {

    String crop;
    String type;
    int id;


    public DataModel(String crop, String type, int id) {
        this.crop = crop;
        this.type = type;
        this.id = id;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
