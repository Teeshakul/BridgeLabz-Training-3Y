import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String str) {
        System.out.println("Generating IllegalArgumentException...");
        String sub = str.substring(5, 2); 
        System.out.println("Substring: " + sub);
    }

    public static void handleException(String str) {
        System.out.println("Handling IllegalArgumentException...");
        try {
            String sub = str.substring(5, 2); 
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();
        handleException(input);

        sc.close();
    }
}
