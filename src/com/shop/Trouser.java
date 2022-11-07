package com.shop;

public class Trouser extends Clothes {
    private int length;
    private int width;

    public Trouser() {
    }

    public Trouser(double price, String color, String description, int quantity, int length, int width) {
        super(price, color, description, quantity);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void printInfo(int index) {
        System.out.println(index + ". " + getPrice() + "  " + getColor() + "  " + getDescription() +
                "  " + getQuantity() + " " + length + " " + width);
    }
}
