package com.company;

public class DoWhileSchleifeDoCount {

    public static void main(String[] args) {
        //
        countToHundred(0);
        countToHundredInclusiv(0);
    }

    public static void countToHundred(int from) {
        do {
            from++;
            System.out.println(from);
        }
        while (from < 100);
    }

    public static void countToHundredInclusiv(int from) {
    do {
        System.out.println(from);
        from ++;
    }
    while (from <=100);

    }
}
