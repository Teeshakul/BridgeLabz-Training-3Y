import java.util.*;

public class SplitTextCompare {
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
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] manual = splitManual(text);
        String[] builtin = text.split(" ");
        System.out.println("Match: " + compareArrays(manual, builtin));
        sc.close();
    }
}
