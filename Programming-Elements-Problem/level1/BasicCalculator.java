import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter number2: ");
        double n2 = sc.nextDouble();

        System.out.println("Addition: " + (n1 + n2));
        System.out.println("Subtraction: " + (n1 - n2));
        System.out.println("Multiplication: " + (n1 * n2));
        System.out.println("Division: " + (n1 / n2));
    }
}
