package com.letscode.exercices.list.exercise4;

import java.util.Scanner;

public class GreatestLeastMean {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] numbers = new float[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number: ");
            numbers[i] = input.nextFloat();
        }

        System.out.print("The set ");
        printNumbers(numbers);
        System.out.printf(" has the following parameters:%n" +
                        "Greatest number = %.2f%n" +
                        "Least number = %.2f%n" +
                        "Mean = %.2f%n",
                setGreatest(numbers),
                setLeast(numbers),
                calculateMean(numbers));
    }

    public static void printNumbers(float[] numbers) {
        System.out.print("{");
        for (float number : numbers) {
            System.out.printf(" %.2f ", number);
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
