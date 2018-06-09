package com.galvanize;

public class Grade {
    public String grade(int input) {
        if (input >= 90) {
            return "A";
        }
        if (input >= 80) {
            return "B";
        }
        if (input >= 70) {
            return "C";
        }
        if (input >= 60) {
            return "D";
        }
        return "F";
    }

    public void printInt() {
        int i = 45;
        while (i <= 50) {
            System.out.println(i);
            i++;
        }
        for (int j = 2; j <= 6; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        Grade grade = new Grade();
        System.out.println(grade.grade(90));
        System.out.println(grade.grade(89));
        System.out.println(grade.grade(80));
        System.out.println(grade.grade(79));
        System.out.println(grade.grade(60));
        System.out.println(grade.grade(55));
        grade.printInt();
    }
}
