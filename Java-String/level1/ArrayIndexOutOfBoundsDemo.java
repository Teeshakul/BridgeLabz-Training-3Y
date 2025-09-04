import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    static void generate(String[] arr) {
        System.out.println(arr[arr.length]);
    }
    static void handle(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.next();
        handle(arr);
        sc.close();
    }
}
