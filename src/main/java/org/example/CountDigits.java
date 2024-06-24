package org.example;

public class CountDigits {
    public static void main(String[] args) {
        int num = 1;
        countDigits(num);

    }

    public static void countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("The number of digits are " + count);
        System.out.println("Test Git");
    }
}
