package com.company;

import java.util.Arrays;

public class ArraUebung {

    public static void main(String[] args) {
        int [] array = new int[3];
         array[0] = 12;
         array[1] = 56;
         array[2] = 91;

       // System.out.println(array); (zeigt einem nur den speicherplatz am computer)
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[] {12, 14, 75, 15};
        System.out.println(Arrays.toString(array2));

        //neu zuweisen

        array [2] = 15;
        System.out.println(Arrays.toString(array));
    }
}
