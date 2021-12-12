package com.letscode.exercices.list.exercise8;

public class Person {
    public String name;
    public float height;
    public float weight;
    private float bmi;

    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.bmi = setBmi();
    }

    public float getBmi() {
        return bmi;
    }

    private float setBmi() {
        return this.weight / (this.height * this.height);
    }

    public void printBmi() {
        System.out.println("----------------------------------------");
        System.out.printf("%s:%nBMI = %.2f kg/m²%n", this.name, this.bmi);
        if (18.5 < this.bmi && this.bmi < 25) {
            System.out.println("Congrats! You are in the healthy BMI range. =)");
        } else {
            System.out.println("Sorry! You are not in the healthy BMI range. =(");
        }
    }
}
