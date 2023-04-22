public class Solution {
  private final static int aAscii = 65;
  private final static int zAscii = 90;
  private final static int subAscii = 26;
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int L = in.nextInt();
    int H = in.nextInt();
    if (in.hasNextLine()) {
      in.nextLine();
    }

    String T = in.nextLine().toUpperCase();
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < H; i++) {
      String ROW = in.nextLine();
      T.chars().forEach(character -> {
        int position = character < aAscii || character > zAscii ? subAscii : character - aAscii;
        int start = position * L;
        answer.append(ROW.substring(start, start + L));
      });
      answer.append("\n");
    }

    System.out.println(answer.toString());
  }
}