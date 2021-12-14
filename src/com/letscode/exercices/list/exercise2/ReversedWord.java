package com.letscode.exercices.list.exercise2;

import java.util.Scanner;

public class ReversedWord {

    public static void main(String[] args) {
        String word = readWord();
        reverseWord(word);
    }

    public static final String START_REVERSE_WORD_PROGRAM_MESSAGE =
            "----- Welcome to the Reverse Word game ----- \n" +
                    "Let's see a word in the reverse order? \n" +
                    "Please enter a word: ";

    public static final String WORD_MESSAGE =
            "Reading %s backwards we have: ";

    public static void printStartReverseWordProgramMessage() {
        System.out.print(START_REVERSE_WORD_PROGRAM_MESSAGE);
    }

    public static void printWordMessage(String word) {
        System.out.printf(WORD_MESSAGE, word);
    }

    public static String readWord() {
        printStartReverseWordProgramMessage();
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void reverseWord(String word) {
        char[] wordLetters = word.toCharArray();
        printWordMessage(word);
        for (int i = (wordLetters.length - 1); i >= 0; i--) {
            System.out.printf("%c", wordLetters[i]);
        }
        System.out.println();
    }

}
