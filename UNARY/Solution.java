import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    private final static int asciiSize = 7;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();

        StringBuilder binaryMessage = new StringBuilder();
        MESSAGE.chars().forEach(character -> {
            String binaryCharacter = Integer.toBinaryString(character);
            if (binaryCharacter.length() < asciiSize) {
                binaryCharacter = "0".repeat(asciiSize - binaryCharacter.length()) + binaryCharacter;
            }
            binaryMessage.append(binaryCharacter);
        });
        List<String> binarySplit = Arrays.asList(binaryMessage.toString().split("(?<=(.))(?!\\1)"));
        String answer = binarySplit.stream().reduce("", (acc, curr) -> {
            acc += (curr.startsWith("1") ? "0 " : "00 ") + "0".repeat(curr.length());
            acc += " ";
            return acc;
        }, (a, b) -> "");
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(answer.stripTrailing());
    }
}