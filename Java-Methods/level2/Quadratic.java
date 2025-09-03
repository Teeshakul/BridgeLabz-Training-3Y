import java.util.Scanner;

public class Quadratic {

    public static double[] findRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{r1, r2};
        } else if (delta == 0) {
            double r = -b / (2.0 * a);
            return new double[]{r};
        } else {
            return new double[]{}; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            System.out.print("Roots: ");
            for (double r : roots) System.out.print(r + " ");
        }
        sc.close();
    }
}
