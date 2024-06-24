package org.example;

public class FibnocciSeries {
    public static void main(String[] args) {
        int limit = 7;
        generateFibnocciSeries(limit);

    }

    public static void generateFibnocciSeries(int limit) {

        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.print(n1 +" "+ n2);
        for (int i = 0; i <= limit; i++) {
            sum = n1 + n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;


        }

    }
}
