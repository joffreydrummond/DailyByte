package com.jed.dailybyte.string.correctCapitalization;

public class Main {
    public static void main(String[] args) {
        System.out.println(correctCapitalization("Dave"));
    }


    /*Given a string, return whether or not it uses capitalization correctly.
    A string correctly uses capitalization if all letters are capitalized,
    no letters are capitalized, or only the first letter is capitalized.*/

    public static boolean correctCapitalization(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        return count == 0 || count == word.length() || count == 1 && count == word.charAt(0);

    }


}
