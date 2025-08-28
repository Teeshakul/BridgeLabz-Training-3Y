import java.util.Scanner;

public class SubstringDemo {
    public static String customSubstring(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += s.charAt(i);
        }
        return res;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String s1 = customSubstring(text, start, end);
        String s2 = text.substring(start, end);
        System.out.println("User-defined: " + s1);
        System.out.println("Built-in: " + s2);
        System.out.println("Compare: " + compareStrings(s1, s2));
    }
}
