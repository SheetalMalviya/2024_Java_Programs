package org.example;

public class PrintEvenAndOdd {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5,};
        printEvenAndOddNumbersOfArray(ar);

    }

    public static void printEvenAndOddNumbersOfArray(int ar[]) {
        System.out.println("The even numbers in array are");
        for (int value : ar) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
        System.out.println("The Odd numbers in array are");
        for (int value : ar) {
            if (value % 2 != 0) {
                System.out.println(value);
            }

        }

    }
}

