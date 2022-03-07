package com.company;

public class UebungArrayNeu {

    public static void main(String[] args) {

        int[] schachtel = new int[]{3, 5, 7, 11, 13, 17};

        printArray(schachtel);
        containsNumber( 4, schachtel);
        System.out.println(containsNumber(4, schachtel));

    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.println(array[i] + ", ");
            }

        }

    }
    public static boolean containsNumber(int number, int [] array) {
        boolean isContain = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                isContain = true;
            }
            else {
                isContain = false;
            }
        }
        return isContain;

    }
}