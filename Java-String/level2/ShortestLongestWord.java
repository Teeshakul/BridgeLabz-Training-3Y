import java.util.*;

public class ShortestLongestWord {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (getLength(w) < getLength(shortest)) shortest = w;
            if (getLength(w) > getLength(longest)) longest = w;
        }
        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
        sc.close();
    }
}
