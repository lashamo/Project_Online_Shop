package com.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Hello--");
        Shop shop = new Shop();

        while (true){
            System.out.println("Please enter mode :");
            System.out.println("1. Manager");
            System.out.println("2. Client");
            System.out.println("0. Exit");
            int mode = scanner.nextInt();

            if (mode == 0){
                break;
            } else if (mode == 1) {
                while (true){
                    System.out.println("Please enter action");
                    System.out.println("1. Add T-Shirt");
                    System.out.println("2. Add Trouser");
                    System.out.println("3. Buy");
                    System.out.println("0. Exit");
                    int action= scanner.nextInt();
                    if (action == 0 ){
                        break;
                    }
                      switch (action){
                        case 1:
                            System.out.println("Price");
                            int price = scanner.nextInt();
                            System.out.println("Color");
                            String color = scanner.next();
                            System.out.println("Description");
                            String description = scanner.next();
                            System.out.println("Quantity");
                            int quantity = scanner.nextInt();
                            System.out.println("size");
                            String size = scanner.next();
                            TShirt tShirt = new TShirt(price, color, description, quantity,size);
                            shop.addClothes(tShirt);

                            break;

                        case 2:
                            System.out.println("Price");
                            price = scanner.nextInt();
                            System.out.println("Color");
                            color = scanner.next();
                            System.out.println("Description");
                            description = scanner.next();
                            System.out.println("Quantity");
                            quantity = scanner.nextInt();
                            System.out.println("Size length");
                            int length = scanner.nextInt();
                            System.out.println("Size width");
                            int width = scanner.nextInt();
                            Trouser trouser = new Trouser(price, color, description, quantity, length, width );
                            shop.addClothes(trouser);

                            break;




                    }

                }


            } else if (mode ==2) {
                System.out.println("Please enter action");
                System.out.println("1.  Show manu");
                int action = scanner.nextInt();
                if (action == 1 ){
                    shop.showClothes();
                }

            }

        }


    }
}
