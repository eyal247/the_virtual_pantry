package com.example.thevirtualpantry.model;

import android.graphics.Bitmap;

public class Item {

    private String name;
    private int quantity;
    private Bitmap bitmap;

    public Item() {
    }

    public Item(String name, int quantity, Bitmap bitmap) {
        this.name = name;
        this.quantity = quantity;
        this.bitmap = bitmap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfItems() {
        return quantity;
    }

    public void setNumOfItems(int numOfItems) {
        this.quantity = numOfItems;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
