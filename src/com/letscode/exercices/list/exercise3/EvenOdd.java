package com.letscode.exercices.list.exercise3;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        float[] numbers = new float[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number: ");
            numbers[i] = input.nextFloat();
        }

        System.out.println("The even numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (!(numbers[i] % 2 == 0)) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println("The odd numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }

}
