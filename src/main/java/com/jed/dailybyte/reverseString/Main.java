package com.jed.dailybyte.reverseString;

public class Main {
    public static void main(String[] args) {
       reverseString("Did this work");

    }


    /* Given a string, reverse all of its characters and return the resulting string.*/


    public static void reverseString(String word){
        //use a stringbuffer because it is mutable
        StringBuffer reverse = new StringBuffer(word);
        //use a stringbuilder method
        StringBuilder reverse1 = new StringBuilder(word);
        //then use the stringbuffer methods to reverse the string
        reverse.reverse();
        reverse1.reverse();
        System.out.println(reverse);
        System.out.println(reverse1);

    }


}
