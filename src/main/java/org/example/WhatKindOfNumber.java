package org.example;

public class WhatKindOfNumber {

    public String processNumber(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                if (number % 3 == 0) {
                    return "Positive Even Multiple of 3";
                } else {
                    return "Positive Even Not Multiple of 3";
                }
            } else {
                return "Positive Odd";
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                return "Negative Even";
            } else {
                return "Negative Odd";
            }
        } else {
            return "Zero";
        }
    }

}
