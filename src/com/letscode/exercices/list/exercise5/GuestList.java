package com.letscode.exercices.list.exercise5;

import java.util.Scanner;

public class GuestList {

    public static void main(String[] args) {
        char[][] guestList = new char[5][];

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of your guests: ");
        for (int i = 0; i < guestList.length; i++) {
            System.out.printf("%d. ", i + 1);
            guestList[i] = input.nextLine().toCharArray();
        }

        System.out.println("The longest name of the guestList is:");
        printName(findLongestName(guestList));
    }

    public static char[] findLongestName(char[][] guestList) {
        char[] longestName = guestList[0];
        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].length > longestName.length) {
                longestName = guestList[i];
            }
        }
        return longestName;
    }

    public static void printName(char[] longestName) {
        for (char letter : longestName) {
            System.out.print(letter);
        }
    }
}
