import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            people[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            people[i][1] = sc.nextDouble();
        }

        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            double bmi = calculateBMI(people[i][0], people[i][1]);
            String status = getStatus(bmi);
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", people[i][0], people[i][1], bmi, status);
        }
        sc.close();
    }
}
