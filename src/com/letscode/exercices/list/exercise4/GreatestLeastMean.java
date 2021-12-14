package com.letscode.exercices.list.exercise4;

import java.util.Scanner;

public class GreatestLeastMean {

    public static void main(String[] args) {
        final int TOTAL_NUMBERS = 5;
        float[] numbers = new float[TOTAL_NUMBERS];

        readNumber(numbers);
        float greatestNumber = setGreatestNumber(numbers);
        float leastNumber = setLeastNumber(numbers);
        float mean = calculateMean(numbers);
        printGreatestLeastMean(numbers, greatestNumber, leastNumber, mean);
    }

    public static final String ENTER_NUMBER_MESSAGE = "Please enter a number: ";

    public static void printEnterNumberMessage() {
        System.out.print(ENTER_NUMBER_MESSAGE);
    }

    public static void readNumber(float[] numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            printEnterNumberMessage();
            numbers[i] = input.nextFloat();
        }
    }

    public static float setGreatestNumber(float[] numbers) {
        float greatestNumber = numbers[0];
        for (float number : numbers) {
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }
        return greatestNumber;
    }

    public static float setLeastNumber(float[] numbers) {
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

    public static void printGreatestLeastMean(float[] numbers, float greatestNumber,
                                              float leastNumber, float mean) {
        System.out.print("The set ");
        System.out.print("[");
        for (float number : numbers) {
            System.out.printf(" %.2f ", number);
        }
        System.out.print("]");
        System.out.printf(" has the following parameters:%n- Greatest number = %.2f%n" +
                        "- Least number = %.2f%n" + "- Mean = %.2f",
                greatestNumber,
                leastNumber,
                mean);
    }

}
