package com.jed.dailybyte.string.palindome;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama."));
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j){
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
            if (Character.toLowerCase(str.charAt(i++)) != Character.toLowerCase(str.charAt(j--))){
                return false;
            }
        }

        return true;
    }

}
