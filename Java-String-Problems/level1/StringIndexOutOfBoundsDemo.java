import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String str) {
        System.out.println("Generating StringIndexOutOfBoundsException...");
        char ch = str.charAt(str.length()); 
        System.out.println("Character: " + ch); 
    }
    public static void handleException(String str) {
        System.out.println("Handling StringIndexOutOfBoundsException...");
        try {
            char ch = str.charAt(str.length()); 
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
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
