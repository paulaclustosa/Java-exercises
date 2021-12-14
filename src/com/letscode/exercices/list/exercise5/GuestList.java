package com.letscode.exercices.list.exercise5;

import java.util.Scanner;

public class GuestList {

    public static void main(String[] args) {
        final int TOTAL_GUESTS = 5;
        char[][] guestList = new char[TOTAL_GUESTS][];

        readGuestName(guestList);
        char[] longestName = findLongestName(guestList);
        printLongestName(longestName);
    }

    public static final String ENTER_GUESTS_NAMES = "Please enter the name of your guests: ";
    public static final String LONGEST_NAME_MESSAGE = "The longest name of the guestList is: ";

    public static void printEnterGuestsNames() {
        System.out.println(ENTER_GUESTS_NAMES);
    }

    public static void readGuestName(char[][] guestList) {
        Scanner input = new Scanner(System.in);
        printEnterGuestsNames();
        for (int i = 0; i < guestList.length; i++) {
            System.out.printf("%d. ", i + 1);
            guestList[i] = input.nextLine().toCharArray();
        }
    }

    public static char[] findLongestName(char[][] guestList) {
        char[] longestName = guestList[0];
        for (char[] guestName : guestList) {
            if (guestName.length > longestName.length) {
                longestName = guestName;
            }
        }
        return longestName;
    }

    public static void printLongestName(char[] longestName) {
        System.out.print(LONGEST_NAME_MESSAGE);
        for (char letter : longestName) {
            System.out.print(letter);
        }
    }
}
