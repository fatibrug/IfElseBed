package com.company;

public class ScannerNeueAufgabe {

    public static void main(String[] args) {

        java.util.Scanner letter = new java.util.Scanner(System.in);

        System.out.println("Enter a letter: ");

        String letter1 = letter.next();

        while (!letter1.equals("0")) {
            if (letter1.equals("a") || letter1.equals("e") || letter1.equals("i") || letter1.equals("o") || letter1.equals("u")) {
                System.out.println("The letter" + letter1 + "is a vowel!");
                System.out.println("Pleas more letters: ");
                letter1 = letter.next();

            } else {
                System.out.println("Your letter " + letter1 + "is not a vowel");
                System.out.println("Pleas another letter:");
                letter1 = letter.next();
            }
        }
            System.out.println("game over!");
            letter.close();



    }
}