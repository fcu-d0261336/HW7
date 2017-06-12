package com.example.niu.hw7;

import android.graphics.Bitmap;

/**
 * Created by NIU on 6/6/17.
 */

public class Hotel {
    private Bitmap imgUrl;
    private String name;
    private String Add;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return Add;
    }

    public void setAdd(String add) {
        Add = add;
    }

    public Bitmap getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Bitmap imgUrl) {
        this.imgUrl = imgUrl;
    }
}
