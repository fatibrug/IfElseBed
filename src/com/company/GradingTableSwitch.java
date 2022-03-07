package com.company;

public class GradingTableSwitch {

    public static void main(String[] args) {

        System.out.println(getGradeText(5));
        System.out.println(getGradeText(4));
        System.out.println(getGradeText(3));
        System.out.println(getGradeText(2));
        System.out.println(getGradeText(1));

    }
    public static String getGradeText (int grade) {
        String greadText;
        return switch (grade) {
            case 1-> greadText = "outstanding";
            case 2 -> greadText = "excellent";
            case 3 -> greadText = "acceptable";
            case 4 -> greadText = "passed";
            case 5 -> greadText = "fail";
            default -> greadText = null;
        };

    }
}
