import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Rate (percent per year): ");
        double r = sc.nextDouble();
        System.out.print("Time (years): ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100.0;
        System.out.printf("Simple Interest = %.2f%n", si);
        sc.close();
    }
}
