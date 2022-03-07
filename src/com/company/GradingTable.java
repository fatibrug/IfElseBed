package com.company;

public class GradingTable {

    public static void main(String[] args) {
          String grade;
          int points = 77;
        grade = getGrade(points);


        System.out.println("grade: " + grade );

    }

    public static String getGrade (int points) {
        String grade;
        if (points >= 90) {
            grade = "outstanding";
        }
        else if (points >= 78)  {
            grade = "excellent";
        }
        else if (points >= 65) {
            grade = "acceptable";
        }
        else if (points >= 51) {
            grade = "passing";
        }
        else {
            grade = "fail";
        }
        return grade;


    }
}
