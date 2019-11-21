package com.example.thevirtualpantry.model;

public class Item {

    private String name;
    private int quantity;
    private int thumbnail;

    public Item() {
    }

    public Item(String name, int quantity, int thumbnail) {
        this.name = name;
        this.quantity = quantity;
        this.thumbnail = thumbnail;
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

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
