package org.example;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "level";
        // isStringAPalindroome(str);
        isStringPalindromeUsingSBF(str);

    }

    public static void isStringAPalindroome(String str) {
        String org_str = str;
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (org_str.equalsIgnoreCase(rev)) {
            System.out.println("The string is a plaindrome");
        } else {
            System.out.println("The string is not a plaindrome");
        }
    }

    public static void isStringPalindromeUsingSBF(String str) {
        StringBuffer rev = null;
        StringBuffer org_str = new StringBuffer(str);
        StringBuffer sbf = new StringBuffer(str);
        rev = sbf.reverse();
        if (org_str.equals(rev)) {
            System.out.println("The string is a plaindrome");
        } else {
            System.out.println("The string is not a plaindrome");
        }
    }
}
