package com.jed.dailybyte.vacuumCleanerRoute;

public class Main {
    public static void main(String[] args) {
        System.out.println(vacuumReturnsToOriginalPosition("LR"));
    }

   /*
   Given a string representing the sequence of moves a robot vacuum makes,
    return whether or not it will return to its original position.
    The string will only contain L, R, U, and D characters,
    representing left, right, up, and down respectively
    */

    public static boolean vacuumReturnsToOriginalPosition(String moves) {
        int UD = 0;
        int LR = 0;

        for (int i = 0; i < moves.length(); i++) {
            char currentPosition = moves.charAt(i);
            if (currentPosition == 'U') {
                UD++;
            } else if (currentPosition == 'D') {
                UD--;
            } else if (currentPosition == 'L') {
                LR++;
            } else if (currentPosition == 'R') {
                LR--;
            }
        }
        return UD == 0 && LR == 0;
    }
}
