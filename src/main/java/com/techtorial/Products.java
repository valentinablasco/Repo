package com.techtorial;

import java.util.Scanner;

public class Products {

    /*
     * Please add more vending machine features
     * - Buy a product
     * - Search for a product
     * - Get list of products
     */

    private static String[] products = new String[]{"Monitor", "Mouse", "Keyboard", "USB cable", "Charger", "Mouse pad"};
    private static int[] prices = new int[]{100, 70, 89, 17, 99, 5};
    private static int[] inventory = new int[]{4, 10, 5, 10, 5, 7};

    static Scanner sc = new Scanner(System.in);


    public static String[] listOfProducts() {
        System.out.println("List of the products:");
        for (String nameOfProducts : products) {
            System.out.println(nameOfProducts + "");
        }
        return products;
    }

    public static String[] getAllPrices() {
        System.err.println("Product: price");
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j] + ": $" + prices[j]);
        }
        return products;
    }

    public static int getInfo() {
        System.out.println("What item info you want to have?");
        String item = sc.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (item.equalsIgnoreCase(products[i])) {
                System.out.println("Price-" + prices[i] + " ,inventory" + inventory[i]);
            }
        }
        return 0;
    }

    public static int getProductPrice(String productName) {
        int index = 0;
        for (String s : products) {
            if (productName.equalsIgnoreCase(s)) {
                return prices[index];

            }
            index++;
        }
        System.out.println("Sorry the product you entered is not available");
        return -1;
    }

    public static void selectProduct(String productName) {
        for (int i = 0; i < products.length; i++) {
            if (productName.equalsIgnoreCase(products[i])) {
                if (inventory[i] > 0) {
                    getProductPrice(productName);
                    System.out.println("Do you want to buy this item?");
                    String buyItem = sc.nextLine();
                    if (buyItem.equalsIgnoreCase("yes")) {
                        buyAProduct(productName);
                    } else {
                    }
                }
            }
        }


        //loop over the product list to find out if it is available in our vending machine
        //if yes find the price (tip: call a specific method)
        //and verify this product is available in inventory
        //ask if customer wants to buy it -> if yes call another method to buy a product
//											-> if no call method to cancel it
    }

    public static void buyAProduct(String productName) {
        for (int i = 0; i < products.length; i++) {
            if (productName.equalsIgnoreCase(products[i])) {
                System.out.println(" Your total is $ " + prices[i]);
                System.out.println(" What is your amount ");
                int amount = sc.nextInt();

                if (amount >= prices[i]) {
                    System.out.println("Your change is" + (amount - prices[i]));
                    inventory[i] = inventory[i] - 1;
                } else if (amount < prices[i]) {
                    System.out.println("Your amount is not enough,you need to add" + (prices[i] - amount));
                } else {
                }
                inventory[i] = inventory[i] - 1;
            }
        }
    }

    /*
    Apply payment logic.
    Apply give back change logic
    Apply inventory update logic: if someone buys an item, we should decrement number of available items.
     */
    public static void priceRange(int minAmount, int maxAmount) {
        for (int i = 0; i < products.length; i++) {
            if (maxAmount >= prices[i] && minAmount <= prices[i]) {
                System.out.println("You can buy item" + products[i]);
            }
        }
    }

}

