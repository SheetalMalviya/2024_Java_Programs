package org.example;

public class CountSumOfDigits {
    public static void main(String[] args) {
        int num = 104;
        countSumOfDigitsInANumber(num);

    }

    public static void countSumOfDigitsInANumber(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of digits in given number is " + sum);
    }
}
