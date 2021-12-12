package com.letscode.exercices.list.exercise6;

import java.util.Scanner;

public class UpperCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        char[] word = input.next().toCharArray();

        for (int i = 1; i < word.length; i += 2) {
            word[i] = Character.toUpperCase(word[i]);
        }

        for (char letter : word) {
            System.out.print(letter);
        }
    }
}
