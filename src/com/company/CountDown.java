package com.company;

public class CountDown {


    public static void main(String[] args){

        counter(1, 10);

    }

        public static void counter (int nummber1, int nummber2) {

        while (nummber1 <= nummber2) {
            System.out.println(nummber2);
            nummber2 --;
        }
    }
}
