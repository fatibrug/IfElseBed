package com.company;

public class SwitchZweiteMethode {
    public static void main(String[] args) {

        System.out.println();

    }
    public static int getDay (String gradeText) {
    return switch (gradeText) {
    case "outstanding" -> 1;
    case "excellent" -> 2;
    case "acceptable" -> 3;
    case "passed" -> 4;
    case "faild"-> 5;
        default -> 0;
    };
    }
}
