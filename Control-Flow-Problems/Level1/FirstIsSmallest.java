import java.util.Scanner;

public class FirstIsSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        boolean isSmallest = num1 < num2 && num1 < num3;
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
