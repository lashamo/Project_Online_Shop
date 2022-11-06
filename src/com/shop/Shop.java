package com.shop;

public class Shop implements IShop {

    private static final int CLOTHES_MAX_NUMBER = 100;

    private String name;
    private String location;
    private Clothes[] clothesArray;

    private int clothesAmount;

    public Shop() {
    }

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
        this.clothesArray = new Clothes[CLOTHES_MAX_NUMBER];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Clothes[] getClothesArray() {
        return clothesArray;
    }

    @Override
    public void addClothes(Clothes clothes1) {
        clothesArray[clothesAmount] = clothes1;
        clothesAmount++;
    }

    @Override
    public void showClothes() {
        System.out.println("----------ShowClothes----------");

        System.out.println("T-Shirts:");
        for (int i = 0; i < clothesAmount; i++) {
            if (clothesArray[i] instanceof TShirt) {
                clothesArray[i].printInfo();
            }
        }

        System.out.println("Trousers:");
        for (int i = 0; i < clothesAmount; i++) {
            if (clothesArray[i] instanceof Trouser) {
                clothesArray[i].printInfo();
            }
        }
    }

    @Override
    public void buy(int index) {
        Clothes clothes = clothesArray[index];
        if (clothes.getQuantity() == 0) {
            System.out.println("You can't but this product");
        } else {
            System.out.println("Product is successfully bought");
            clothes.setQuantity(clothes.getQuantity() - 1);
        }
    }
}
