package com.letscode.exercices.list.exercise2;

import java.util.Scanner;

public class ReversedWord {

    public static void main(String[] args) {
        printStartReverseWordGameMessage();
        String word = readWord();
        reverseWord(word);
    }

    public static final String START_REVERSE_WORD_PROGRAM_MESSAGE =
            "----- Welcome to the Reverse Word game ----- \n" +
                    "Let's see a word in the reverse order? \n" +
                    "Please enter a word: ";

    public static void printStartReverseWordGameMessage() {
        System.out.print(START_REVERSE_WORD_PROGRAM_MESSAGE);
    }

    public static String readWord() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void reverseWord(String word) {
        char[] letters = word.toCharArray();

        System.out.printf("Reading %s backwards we have: ", word);
        for (int i = (letters.length - 1); i >= 0; i--) {
            System.out.printf("%c", letters[i]);
        }
    }

}
