package org.example;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;
        int c = 20;
        findLargestUsingAlgo(a, b, c);
        findLargestUsingTernaryOperator(a,b,c);


    }

    public static void findLargestUsingAlgo(int a, int b, int c) {
        if (a > b & a > c) {
            System.out.println(a + " is the largest number");
        } else if (b > c) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }

    }
    public static void findLargestUsingTernaryOperator(int a,int b,int c){
        int second_largest=a>b?a:b;
        int largest=second_largest>c?second_largest:c;
        System.out.println("The largest number is "+ largest);
    }
}
