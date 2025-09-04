import java.util.*;

public class WordsWithLengths {
    public static String[] splitManual(String text) {
        ArrayList<String> list = new ArrayList<>();
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (!word.isEmpty()) list.add(word);
                word = "";
            } else word += c;
        }
        if (!word.isEmpty()) list.add(word);
        return list.toArray(new String[0]);
    }
    public static int getLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) {}
        return count;
    }
    public static String[][] getWordLengths(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getLength(words[i]));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String[][] result = getWordLengths(words);
        for (String[] r : result) System.out.println(r[0] + " - " + r[1]);
        sc.close();  
      }
}
