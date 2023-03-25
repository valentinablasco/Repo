package com.techtorial;

public class Instructions {


    public static void getInstructions(int input) {

        switch (input) {
            case 0:
                System.out.println("Press ");
                System.out.println("1 - List all items/products, names of products\n" +
                        "                 * 2 - Get item/product info (details, availability), price and inventory number\n" +
                        "                 * 3 - Select a product\n" +
                        "                 * 4 - Get item/product price\n" +
                        "                 * 5 - List all prices\n" +
                        "                 * 6 - Set price range\n" +
                        "                 * 7 - Exit\n" +
                        "                 * 8 - Buy an item");

                /*
                 * Vending machine options are:
                 * 1 - List all items/products, names of products
                 * 2 - Get item/product info (details, availability), price and inventory number
                 * 3 - Select a product
                 * 4 - Get item/product price
                 * 5 - List all prices
                 * 6 - Set price range
                 * 7 - Exit
                 * 8 - Buy an item
                 */
            default:
                System.out.println("Please enter 0");
        }
    }

}
