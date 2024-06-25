package org.example;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 1, 8, 2, 9, 3, 0, 9, 9};
        getDuplicateInArray(ar);
        getDuplicateUsingHashSet(ar);
    }

    public static void getDuplicateInArray(int ar[]) {
        int dup = 0;
        System.out.println("The duplicates found in array are");
        for (int i = 0; i < ar.length - 2; i++) {
            for (int k = i + 1; k <= ar.length - 1; k++) {
                if (ar[i] == ar[k]) {
                    System.out.println(ar[i]);
                }
            }

        }
    }

    public static void getDuplicateUsingHashSet(int ar[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int value : ar) {
            if (hs.add(value) == false) {
                System.out.println("Found Duplicate value" + value
                );
            }
        }

    }
}
