package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String str = "OmSaiRam";
        revStringUsingAlgorithm(str);
        revStringUsingStringBuffer(str);
    }

    public static void revStringUsingAlgorithm(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Using algorithm,the reverse of " + str + " is " + rev);
    }

    public static void revStringUsingStringBuffer(String str) {
        StringBuffer rev = null;
        StringBuffer sb = new StringBuffer(str);
        rev = sb.reverse();
        System.out.println("Using StringBuffer,the reverse of " + str + " is " + rev);
    }


}

