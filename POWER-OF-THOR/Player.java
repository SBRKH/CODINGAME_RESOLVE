import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Solve this puzzle by writing the shortest code.
 * Whitespaces (spaces, new lines, tabs...) are counted in the total amount of
 * chars.
 * These comments should be burnt after reading!
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position

        Integer thorX = null;
        Integer thorY = null;
        // game loop
        while (true) {
            String directionX = "";
            String directionY = "";
            if (thorX == null && thorY == null) {
                thorX = TX;
                thorY = TY;
            }

            if (thorX != LX) {
                directionX = thorX > LX ? "W" : "E";
                thorX = directionX == "W" ? thorX - 1 : thorX + 1;
            }

            if (thorY != LY) {
                 directionY = thorY > LY ? "N" : "S";
                thorY = directionY == "N" ? thorY - 1 : thorY + 1;
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(directionY + directionX);
        }
    }
}