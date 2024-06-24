package org.example;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 71;
        isPrime(num);
    }

    public static void isPrime(int num) {
        int count = 0;
        if (num > 1) {
            for (int i = 2; i < num; i++)
                if (num % i == 0)
                    count++;
        }
        else
            System.out.println("The number is  a prime number");
        if (count > 2)
            System.out.println("The number is not a prime number");
        else
            System.out.println("The number is  a prime number");
    }
}


