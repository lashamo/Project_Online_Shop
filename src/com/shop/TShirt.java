package com.shop;

public class TShirt extends Clothes {

    private String size;

    public TShirt() {
    }

    public TShirt(int price, String color, String description, int quantity, String size) {
        super(price, color, description, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void printInfo() {
        System.out.println("About trouser: " + getPrice() + "  " + getColor() + "  " + getDescription() +
                "  " + getQuantity() + " " + size);
    }
}
