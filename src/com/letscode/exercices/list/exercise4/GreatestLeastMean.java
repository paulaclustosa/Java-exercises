package com.letscode.exercices.list.exercise4;

import java.util.Scanner;

public class GreatestLeastMean {

    public static void main(String[] args) {
        float[] numbers = new float[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number: ");
            numbers[i] = input.nextFloat();
        }

        System.out.print("The set ");
        printNumbers(numbers);
        System.out.println(" has the following parameters:");
        System.out.printf("Greatest number = %.2f%n", setGreatest(numbers));
        System.out.printf("Least number = %.2f%n", setLeast(numbers));
        System.out.printf("Mean = %.2f%n", calculateMean(numbers));
    }

    public static void printNumbers(float[] numbers) {
        System.out.print("{");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf(" %.2f ", numbers[i]);
        }
        System.out.print("}");
    }

    public static float setGreatest(float[] numbers) {
        float greatestNumber = numbers[0];
        for (float number : numbers) {
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }
        return greatestNumber;
    }

    public static float setLeast(float[] numbers) {
        float leastNumber = numbers[0];
        for (float number : numbers) {
            if (number < leastNumber) {
                leastNumber = number;
            }
        }
        return leastNumber;
    }

    public static float calculateMean(float[] numbers) {
        float sum = 0;
        for (float number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

}
