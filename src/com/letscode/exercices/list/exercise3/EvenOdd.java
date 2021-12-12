package com.letscode.exercices.list.exercise3;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] numbers = new float[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number: ");
            numbers[i] = input.nextFloat();
        }

        System.out.println("The even numbers are: ");
        for (float number : numbers) {
            if (!(number % 2 == 0)) {
                System.out.println(number);
            }
        }

        System.out.println("The odd numbers are: ");
        for (float number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

}
