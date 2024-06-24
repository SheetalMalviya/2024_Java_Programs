package org.example;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int num = -1;
        countEvenAndOddNumbers(num);
    }
    public static void countEvenAndOddNumbers(int num) {
        int odd = 0;
        int even = 0;
        while (num > 0) {
            int i = num % 10;
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num / 10;
        }
        System.out.println("The count of even numbers is " + even + " and the count of odd numbers is " + odd);
    }
}
