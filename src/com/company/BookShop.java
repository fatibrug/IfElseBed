package com.company;

public class BookShop {

    public static void main(String[] args) {
        // in a BookShop you receive a discount if you buy more than 2 non-fiction and at least one fiction book
        int nonfiction = 2;
        int fiction = 0;
        double discount;
        discount = 3;

        if (nonfiction >= 2) {
            discount = 3;
        } else if (fiction >= 1) {
            discount = 3;
        } else {
            discount = 0;
        }

        System.out.println("i saved: " + discount);


    }
}