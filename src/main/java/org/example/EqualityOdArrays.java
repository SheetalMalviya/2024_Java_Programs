package org.example;

import java.util.Arrays;

public class EqualityOdArrays {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,8};
        int a2[]={1,2,3,4,5};

        checkEqualityOfArrays(a1,a2);

    }

    public static void checkEqualityOfArrays(int a1[], int a2[]) {
        boolean result = Arrays.equals(a1, a2);
        if (result) {
            System.out.println("The arrays are equal");
        } else System.out.println("The arrays are not equal");

    }
}
