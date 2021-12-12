package com.letscode.exercices.list.exercise3;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        readNumbers(numbers);
        getOddNumbers(numbers);
        getEvenNumbers(numbers);
    }

    public static String ENTER_NUMBER_MESSAGE = "Please enter a number: ";
    public static String ODD_NUMBERS_MESSAGE = "The odd numbers are:";
    public static String EVEN_NUMBERS_MESSAGE = "The even numbers are:";

    public static void readNumbers(int[] numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(ENTER_NUMBER_MESSAGE);
            numbers[i] = input.nextInt();
        }
    }

    public static void getOddNumbers(int[] numbers) {
        System.out.println(ODD_NUMBERS_MESSAGE);
        for (float number : numbers) {
            if (!(number % 2 == 0)) {
                System.out.println(number);
            }
        }
    }

    public static void getEvenNumbers(int[] numbers) {
        System.out.println(EVEN_NUMBERS_MESSAGE);
        for (float number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

}
