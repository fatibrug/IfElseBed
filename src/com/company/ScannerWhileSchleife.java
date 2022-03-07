package com.company;

import java.util.Scanner;

public class ScannerWhileSchleife {

    public static void main(String[] args) {

        java.util.Scanner reader = new java.util.Scanner(System.in);

        System.out.println("Pleas enter a number: ");

        int number = reader.nextInt();
        int sum = 0;

        while (number > 0) {
            if (number == 2) {
                sum = sum * 2;
                System.out.println("Double Bonus!");
                System.out.println("Enter another number: ");
                number = reader.nextInt();
            } else if (number == 3) {
                sum = sum * 3;
                System.out.println("Trippled! ");
                System.out.println("Enter another number: ");
                number = reader.nextInt();
            } else if (number == 22) {
                sum = sum / 2;
                System.out.println("Sum halved: ");
                System.out.println("Enter another number: ");
                number = reader.nextInt();
            } else {
                sum += number;  //sum = sum + number (kürzere Schreibweiße)
                System.out.println("Enter another number: ");
                number = reader.nextInt();
            }
        }

        System.out.println("Your total Sum is: " + sum);
        reader.close();

    }

}
