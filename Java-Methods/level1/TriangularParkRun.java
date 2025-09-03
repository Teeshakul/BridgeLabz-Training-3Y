import java.util.Scanner;
class TriangularParkRun {
    public static double rounds(double a, double b, double c) {
        return 5000 / (a + b + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();
        System.out.println("Rounds needed: " + rounds(a, b, c));
        sc.close();
    }
}
