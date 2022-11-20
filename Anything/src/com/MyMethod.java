package com;

import java.util.Scanner;

public class MyMethod {
    private static final Scanner input = new Scanner(System.in);

    private static int BirthYear;
    private static String Name;
    
    public static void nameLengthCounter() {
        String name;
        do {
            System.out.print("Please enter your name: ");
            name = input.nextLine().strip();
        } while (name.length() < 5);

        Name = name;
    }

    public static void ageDetector() {
        int yearOfBirth = 2022;
        do {
            System.out.print("Please enter your year of birth: ");
            yearOfBirth = input.nextInt();
        }
        while (yearOfBirth > 2021);

        BirthYear = yearOfBirth;
    }

    public static void main(String[] args) {
        nameLengthCounter();
        ageDetector();
        System.out.println("Total Characters: " + Name.length());
        System.out.println("Age: " + (2022 - BirthYear));
    }
}
