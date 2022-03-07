package com.company;

public class Bedienungen {

    public static void main(String[] args) {
        // in the bus you receive a discount if you are a senior citizen, a dog or a student

        boolean isDog = false;
                boolean isSenior = true;
                        boolean isStudent = false;
                        double discount;
                        double ticketPrice = 2.5;

                        if (isDog) {
                           discount = ticketPrice * 0.2;
                        }
                        else if (isSenior) {
                            discount = ticketPrice * 0.15;
                        }
                        else if (isStudent){
                        discount = ticketPrice * 0.1;
                        }
                        else {
                            discount = 0;
                        }
        System.out.println("I saved: " + discount+ "€ for my " + ticketPrice + "ticket. ");
    }
}