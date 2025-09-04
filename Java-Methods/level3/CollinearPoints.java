import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        boolean collinear = (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
        System.out.println("Collinear: " + collinear);
        sc.close();
    }
}
