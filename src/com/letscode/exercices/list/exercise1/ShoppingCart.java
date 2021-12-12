package com.letscode.exercices.list.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        String[] fruits = new String[5];

        printAddFruitsMessage();
        readFruits(fruits);
        printFruits(fruits);
    }

    final static String ENTER_FRUIT_MESSAGE = "----- Hello! Please add fruits to shopping cart -----";
    final static String DISPLAY_FRUITS_MESSAGE = "Your shopping cart has the following fruits:";

    public static void printAddFruitsMessage() {
        System.out.println(ENTER_FRUIT_MESSAGE);
    }

    public static void printFruits(String[] fruits) {
        System.out.println(DISPLAY_FRUITS_MESSAGE);
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("- %s%n", fruits[i]);
        }
    }

    public static void readFruits(String[] fruits) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("fruit %d: ", i + 1, ";");
            fruits[i] = input.nextLine();
        }
    }

}

