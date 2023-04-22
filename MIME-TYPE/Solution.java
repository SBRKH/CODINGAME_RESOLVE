import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    private static boolean isUnknow(String fname) {
        if (!fname.contains(".") || fname.endsWith(".")) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        Map<String, String> mimeMap = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            mimeMap.put(EXT, MT);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            List<String> test = Arrays.asList(FNAME.split("\\."));
            if (test.isEmpty() || isUnknow(FNAME)) {
                System.out.println("UNKNOWN");
            } else {
                String extension = test.get(test.size() - 1);
                if (mimeMap.containsKey(extension)) {
                    System.out.println(mimeMap.get(extension));
                } else {
                    System.out.println("UNKNOWN");
                }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        // For each of the Q filenames, display on a line the corresponding MIME type.
        // If there is no corresponding type, then display UNKNOWN.
    }
}