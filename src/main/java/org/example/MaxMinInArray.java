package org.example;

public class MaxMinInArray {
    public static void main(String[] args) {
        int ar[] = {2, 4, 1, 8, 10};
        getMaxAndMinInArray(ar);


    }

    public static void getMaxAndMinInArray(int ar[]) {
        int max = 0;
        int min = 0;
        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println("The maximum value is " + max);


        for (int k = 0; k <= ar.length - 1; k++) {
            if (ar[k] < min) {
                min = ar[k];
            }
        }
        System.out.println("The minimum value is " + min);
    }
}
