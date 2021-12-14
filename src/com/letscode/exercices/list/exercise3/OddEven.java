package com.letscode.exercices.list.exercise3;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        final int TOTAL_NUMBERS = 5;
        int[] numbers = new int[TOTAL_NUMBERS];

        readNumbers(numbers);
        getOddNumbers(numbers);
        getEvenNumbers(numbers);
    }

    public static final String ENTER_NUMBER_MESSAGE = "Please enter an integer number: ";
    public static final String ODD_NUMBERS_MESSAGE = "The odd numbers are:";
    public static final String EVEN_NUMBERS_MESSAGE = "The even numbers are:";

    public static void printEnterNumberMessage() {
        System.out.print(ENTER_NUMBER_MESSAGE);
    }

    public static void printOddNumbersMessage() {
        System.out.println(ODD_NUMBERS_MESSAGE);
    }

    public static void printEvenNumbersMessage() {
        System.out.println(EVEN_NUMBERS_MESSAGE);
    }

    public static void readNumbers(int[] numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            printEnterNumberMessage();
            numbers[i] = input.nextInt();
        }
    }

    public static void getOddNumbers(int[] numbers) {
        printOddNumbersMessage();
        for (float number : numbers) {
            if (!(number % 2 == 0)) {
                System.out.println(number);
            }
        }
    }

    public static void getEvenNumbers(int[] numbers) {
        printEvenNumbersMessage();
        for (float number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

}
