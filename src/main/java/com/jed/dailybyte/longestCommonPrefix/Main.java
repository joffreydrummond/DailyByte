package com.jed.dailybyte.longestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        //System.out.println(longestCommonPrefix());
    }


    public static String longestCommonPrefix(String[] strs){
        StringBuilder longestCommonPrefix = new StringBuilder();
        int index = 0;
        for (char c: strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || c != strs[i].charAt(index)){
                    return longestCommonPrefix.toString();
                }
            }

            longestCommonPrefix.append(c);
            index++;
        }
        return longestCommonPrefix.toString();
    }
}

/*
This question is asked by Microsoft. Given an array of strings,
return the longest common prefix that is shared amongst all strings.
        Note: you may assume all strings only contain lowercase alphabetical characters.*/
