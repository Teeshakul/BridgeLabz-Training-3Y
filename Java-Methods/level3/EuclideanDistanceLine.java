import java.util.Scanner;

public class EuclideanDistanceLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double m = (double)(y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        System.out.println("Distance: " + dist);
        System.out.println("Line: y = " + m + "x + " + b);
        sc.close();
    }
}
