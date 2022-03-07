package com.company;

public class BooksMethode {
    public static void main(String[] args) {
        // in a BookShop you receive a discount if you buy more than 2 non-fiction and at least one fiction book
        int nonfiction = 0;
        int fiction = 1;
        double discount = getBookDiscount(fiction, nonfiction);
        discount = 3;


        System.out.println("i saved: " + discount);
    }

    public static double getBookDiscount(int fiction, int nonfiction) {
        double discount;
        if (nonfiction >= 2) {
            discount = 3;
        } else if (fiction >= 1) {
            discount = 3;
        } else {
            discount = 0;
        }
        return discount;
    }
}
