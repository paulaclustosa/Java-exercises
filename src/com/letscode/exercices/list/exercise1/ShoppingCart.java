package com.letscode.exercices.list.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        final int totalItems = 5;

        System.out.println("----- Add fruit to shopping cart -----");
        for (int i = 0; i < totalItems; i++) {
            System.out.printf("fruit %d: ", i + 1, ";");
            list.add(input.nextLine());
        }

        System.out.println("Your shopping cart has the following fruits:");
        printItem(list);
    }

    public static void printItem(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s%n", list.get(i));
        }
    }

}

