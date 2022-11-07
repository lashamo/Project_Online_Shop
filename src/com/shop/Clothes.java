package com.shop;

public abstract class Clothes {
    private double price;
    private String color;
    private String description;
    private int quantity;

    public Clothes() {
    }

    public Clothes(double price, String color, String description, int quantity) {
        this.price = price;
        this.color = color;
        this.description = description;
        this.quantity = quantity;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void printInfo(int index);
}
