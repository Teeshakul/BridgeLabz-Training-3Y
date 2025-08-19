import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        double phy = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chem = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        double math = sc.nextDouble();

        double avg = (phy + chem + math) / 3;

        System.out.println("Average Marks: " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A+ | Remarks: Excellent");
        } else if (avg >= 80) {
            System.out.println("Grade: A | Remarks: Very Good");
        } else if (avg >= 70) {
            System.out.println("Grade: B | Remarks: Good");
        } else if (avg >= 60) {
            System.out.println("Grade: C | Remarks: Satisfactory");
        } else {
            System.out.println("Grade: F | Remarks: Needs Improvement");
        }
    }
}
