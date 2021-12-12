package com.letscode.exercices.list.exercise7;

import java.util.Scanner;

public class YoungestOldestMean {

    public static void main(String[] args) {
        Person[] people = new Person[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the following personal data: ");
        String name;
        int age;
        for (int i = 0; i < people.length; i++) {
            System.out.printf("%d.%n", i + 1);

            System.out.print("Name: ");
            name = input.nextLine();

            System.out.print("Age: ");
            age = input.nextInt();
            input.nextLine();

            people[i] = new Person(name, age);
        }

        printYoungest(findYoungest(people));
        printOldest(findOldest(people));
        printAverageAge(calculateAverageAge(people));

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