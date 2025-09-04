import java.util.Scanner;

public class StringCompare {
    static boolean compareByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        boolean custom = compareByCharAt(s1, s2);
        boolean builtin = s1.equals(s2);
        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtin);
        sc.close();
    }
}
