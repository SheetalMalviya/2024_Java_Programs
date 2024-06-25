package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortElements {
    public static void main(String[] args) {
        int ar[] = {1, 3, 1, 3, 2, 9, 8, 7, 2, 44};
        Integer[] ar1 = {9, 7, 4, 3, 2, 2, 7, 8};
        sortArrayApproach1(ar);
        sortArrayApproachInDesc(ar1);
    }

    public static void sortArrayApproach1(int ar[]) {
        System.out.println("Array before sorting " + Arrays.toString(ar));
        Arrays.sort(ar);
        Arrays.parallelSort(ar);
        System.out.println("Array after sorting " + Arrays.toString(ar));
    }

    public static void sortArrayApproachInDesc(Integer ar[]) {
        System.out.println("Array before sorting " + Arrays.toString(ar));
        Arrays.sort(ar, Collections.reverseOrder());

        System.out.println("Array after sorting " + Arrays.toString(ar));
    }
}
