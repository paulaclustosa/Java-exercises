package com.letscode.exercices.list.exercise1;

import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        final int TOTAL_FRUITS = 5;
        String[] fruits = new String[TOTAL_FRUITS];

        readFruits(fruits);
        printFruits(fruits);
    }

    public final static String ENTER_FRUIT_MESSAGE = "----- Hello! Please add fruits to shopping cart -----";
    public final static String DISPLAY_FRUITS_MESSAGE = "Your shopping cart has the following fruits:";

    public static void printAddFruitsMessage() {
        System.out.println(ENTER_FRUIT_MESSAGE);
    }

    public static void printFruits(String[] fruits) {
        System.out.println(DISPLAY_FRUITS_MESSAGE);
        for (String fruit : fruits) {
            System.out.printf("- %s%n", fruit);
        }
    }

    public static void readFruits(String[] fruits) {
        printAddFruitsMessage();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("Fruit %d: ", i + 1);
            fruits[i] = input.nextLine();
        }
    }

}

