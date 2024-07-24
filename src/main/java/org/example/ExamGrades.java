package org.example;

public class ExamGrades {
    public int grade(int points) {
        if (points >= 0 && points <= 100) {
            if (points >= 90) {
                return 1;
            } else if (points >= 80) {
                return 2;
            } else if (points >= 70) {
                return 3;
            } else if (points >= 50) {
                return 4;
            } else {
                return 5;
            }
        } else {
            throw new IllegalArgumentException("invalid points");
        }
    }
}
