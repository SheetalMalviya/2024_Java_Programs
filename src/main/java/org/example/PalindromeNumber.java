package org.example;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 21212;
        isPalindromeNumber(num);
    }

    public static void isPalindromeNumber(int num) {
        int num1 = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (num1 == rev) {
            System.out.println("The number is a Palindrome Number");
        } else {
            System.out.println("The number is not a Palindrome Number");
        }


    }
}

