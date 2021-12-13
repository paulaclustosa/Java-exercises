package com.letscode.exercices.list.exercise6;

import java.util.Scanner;

public class UpperCase {

    public static void main(String[] args) {
        char[] wordLetters = readWordLetters();
        char[] chagedWordLetters = oddIndexLettersToUpperCase(wordLetters);

        printChangedWordLetters(chagedWordLetters);
    }

    public static final String ENTER_WORD_MESSAGE = "Please enter a word: ";
    public static final String CHANGED_WORD_LETTERS_MESSAGE =
            "Changing letters of odd indexes to uppercase results in: ";

    public static void printEnterWordMessage() {
        System.out.print(ENTER_WORD_MESSAGE);
    }

    public static char[] readWordLetters() {
        Scanner input = new Scanner(System.in);
        printEnterWordMessage();
        return input.next().toCharArray();
    }

    public static char[] oddIndexLettersToUpperCase(char[] wordLetters) {
        for (int i = 1; i < wordLetters.length; i += 2) {
            wordLetters[i] = Character.toUpperCase(wordLetters[i]);
        }
        return wordLetters;
    }

    public static void printChangedWordLetters(char[] wordLetters) {
        System.out.print(CHANGED_WORD_LETTERS_MESSAGE);
        for (char letter : wordLetters) {
            System.out.print(letter);
        }
    }

}
