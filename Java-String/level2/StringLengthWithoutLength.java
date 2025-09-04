import java.util.*;

public class StringLengthWithoutLength {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("Length (user method): " + getLength(text));
        System.out.println("Length (built-in): " + text.length());
        sc.close();
    }
}
