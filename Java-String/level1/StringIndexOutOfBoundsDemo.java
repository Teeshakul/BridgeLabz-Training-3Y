import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    static void generate(String s) {
        System.out.println(s.charAt(s.length() + 1));
    }
    static void handle(String s) {
        try {
            System.out.println(s.charAt(s.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        handle(s);
        sc.close();
    }
}
