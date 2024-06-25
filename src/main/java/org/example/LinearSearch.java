package org.example;

public class LinearSearch {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5, 8};
        int search_ele = 99;
        findElementInArray(ar, search_ele);

    }

    public static void findElementInArray(int ar[], int search_ele) {
        boolean flag = false;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == search_ele) {
                System.out.println("The element is found at " + i + " index");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("The element is not found in the array.");
        }
    }
}
