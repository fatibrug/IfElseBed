package com.company;

public class ForArithmeticTower {

    public static void main(String[] args) {

        int x = 12;


        for (int z = 2; z <= 9; z++) {
            System.out.println(x + " * " + z);
            x = x * z;
        }

        for (int y = 2; y <= 9; y++) {
            System.out.println(x + " / " + y);
            x = x / y;
        }


    }
}
