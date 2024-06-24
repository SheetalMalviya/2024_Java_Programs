package org.example;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 1234;
        reverseNumUsingAlgorithm(num);
        reverseNumUsingStringBufr(num);
        reverseNumUsingStringBuilder(num);
    }

    public static void reverseNumUsingAlgorithm(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Using,algorithm,the reverse of number is " + rev);
    }

    public static void reverseNumUsingStringBufr(int num) {
        StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        rev = sb.reverse();
        System.out.println("Using StringBuffer,the reverse of number is " + rev);
    }

    public static void reverseNumUsingStringBuilder(int num) {
        StringBuilder rev;
        StringBuilder sbr = new StringBuilder();
        sbr.append(num);
        rev = sbr.reverse();
        System.out.println("Using StringBuilder,the reverse of number is " + rev);
    }
}

