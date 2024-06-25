package org.example;

public class Factorial {
    public static void main(String[] args) {
        int num = 0;
        getFactorial(num);
    }

    public static void getFactorial(int num) {
        int fact = 1;
        for (int i = num; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println("The factorial is " + fact);
    }
}
