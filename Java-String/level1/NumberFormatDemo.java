import java.util.Scanner;

public class NumberFormatDemo {
    static void generate(String s) {
        System.out.println(Integer.parseInt(s));
    }
    static void handle(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
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
