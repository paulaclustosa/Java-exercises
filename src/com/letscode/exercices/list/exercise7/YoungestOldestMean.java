package com.letscode.exercices.list.exercise7;

import java.util.Scanner;

public class YoungestOldestMean {

    public static void main(String[] args) {
        final int TOTAL_PEOPLE = 5;
        Person[] people = new Person[TOTAL_PEOPLE];
        readData(people);

        Person youngest = findYoungest(people);
        Person oldest = findOldest(people);
        int averageAge = calculateAverageAge(people);

        printYoungest(youngest);
        printOldest(oldest);
        printAverageAge(averageAge);

    }

    public static final String ENTER_DATA_MESSAGE = "Please enter the following personal data:";

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

            System.out.print("Age: ");
            int age = input.nextInt();

            people[i] = new Person(name, age);
        }
    }

    public static Person findYoungest(Person[] people) {
        Person youngest = people[0];
        for (Person person : people) {
            if (person.age < youngest.age) {
                youngest = person;
            }
        }
        return youngest;
    }

    public static void printYoungest(Person youngest) {
        System.out.println("The youngest person is " + youngest.name + ". " +
                "He/She has " + youngest.age + " years old.");
    }

    public static Person findOldest(Person[] people) {
        Person oldest = people[0];
        for (Person person : people) {
            if (person.age > oldest.age) {
                oldest = person;
            }
        }
        return oldest;
    }

    public static void printOldest(Person oldest) {
        System.out.println("The oldest person is " + oldest.name + ". " +
                "He/She has " + oldest.age + " years old.");
    }

    public static int calculateAverageAge(Person[] people) {
        int sum = 0;
        for (Person person : people) {
            sum += person.age;
        }
        return sum / people.length;
    }

    public static void printAverageAge(int averageAge) {
        System.out.printf("The average age of the entry people is %d" +
                " years old.", averageAge);
    }

}