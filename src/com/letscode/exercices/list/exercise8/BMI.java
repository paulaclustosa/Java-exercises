package com.letscode.exercices.list.exercise8;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Person[] people = new Person[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the following personal data: ");
        for (int i = 0; i < people.length; i++) {
            System.out.printf("%d.%n", i + 1);
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Height (m): ");
            float height = input.nextFloat();
            input.nextLine();

            System.out.print("Weight (kg): ");
            float weight = input.nextFloat();
            input.nextLine();

            people[i] = new Person(name, height, weight);
        }

        for (Person person : people) {
            person.printBmi();
        }
        System.out.println("---------- The End! ----------");
    }
}
