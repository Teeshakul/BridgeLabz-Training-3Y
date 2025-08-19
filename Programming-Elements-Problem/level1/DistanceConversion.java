import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int feet = sc.nextInt();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.println(feet + " feet = " + yards + " yards = " + miles + " miles");
    }
}
