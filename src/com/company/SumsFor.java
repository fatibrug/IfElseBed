package com.company;

public class SumsFor {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 10; i++)
        // sum += i;
        {
            sum = sum + i;
        }
        System.out.println(sum);

        for (int i = 50; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        String sentence = "Finaly weekend! ";
        for (int j = 0; j < 10; j++){
            System.out.println(j + " " + sentence);
        }
    }
}