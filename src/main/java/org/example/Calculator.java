package org.example;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException("b must not be 0.");
        }
        return a / b;
    }

    public double square(double a) {
        return a * a;
    }

    public double squareRoot(double a) {
        if(a < 0) {
            throw new ArithmeticException("a must not lesser than 0.");
        }
        return Math.sqrt(a);
    }
}
