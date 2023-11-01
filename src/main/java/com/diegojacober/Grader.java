package com.diegojacober;

public class Grader {
    public char determineLetterGrade (double numberGrade) throws IllegalArumentException {
        if (numberGrade < 0) {
            throw new IllegalArumentException();
        }
        else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        }
        return 'A';
    }
}
