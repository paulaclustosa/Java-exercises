package com.letscode.exercices.list.exercise2;

import java.util.Scanner;

public class ReversedWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("----- Welcome to the Reverse Word game ----- \n" +
                "Let's see a word in the reverse order? \n" +
                "Please enter a word: ");
        String word = input.nextLine();

        reverse(word);
    }

    public static void reverse(String word) {
        char[] letters = word.toCharArray();

        for (int i = (letters.length - 1); i >= 0; i--) {
            System.out.printf("%c", letters[i]);
        }
    }

}
