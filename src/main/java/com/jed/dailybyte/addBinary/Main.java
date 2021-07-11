package com.jed.dailybyte.addBinary;

public class Main {
    public static void main(String[] args) {

        System.out.println(addBinary("1", "0"));

    }

    /*
    Given two binary strings (strings containing only 1s and 0s)
    return their sum (also as a binary string).
    Note: neither binary string will contain
    leading 0s unless the string itself is 0*/


    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}
