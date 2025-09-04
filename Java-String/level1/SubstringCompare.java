import java.util.Scanner;

public class SubstringCompare {
    static String substringByCharAt(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) res += s.charAt(i);
        return res;
    }
    static boolean compareByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt(), end = sc.nextInt();
        String sub1 = substringByCharAt(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("Equal: " + compareByCharAt(sub1, sub2));
        sc.close();
    }
}
