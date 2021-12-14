package com.letscode.exercices.list.exercise8;

import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {
        final int TOTAL_PEOPLE = 5;
        Person[] people = new Person[TOTAL_PEOPLE];

        readData(people);
        showBMI(people);
        printEndMessage();
    }

    public static final String ENTER_DATA_MESSAGE = "Please enter the following personal data: ";
    public static final String THE_END_MESSAGE = "---------- The End! ----------";

    public static void printEnterDataMessage() {
        System.out.println(ENTER_DATA_MESSAGE);
    }

    public static void readData(Person[] people) {
        Scanner input = new Scanner(System.in);

        printEnterDataMessage();

        for (int i = 0; i < people.length; i++) {
            System.out.printf("%d.%n", i + 1);
            System.out.print("First name: ");
            String name = input.next();

            System.out.print("Height (m): ");
            float height = input.nextFloat();
            input.nextLine();

            System.out.print("Weight (kg): ");
            float weight = input.nextFloat();
            input.nextLine();

            people[i] = new Person(name, height, weight);
        }
    }

    public static void showBMI(Person[] people) {
        for (Person person : people) {
            person.printBmi();
        }
    }

    public static void printEndMessage() {
        System.out.println("---------- The End! ----------");
    }

}
