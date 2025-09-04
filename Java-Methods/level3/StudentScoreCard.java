import java.util.Scanner;

public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + (int)(Math.random() * 61);
            scores[i][1] = 40 + (int)(Math.random() * 61);
            scores[i][2] = 40 + (int)(Math.random() * 61);
        }
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%");
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] +
                    "\t" + total + "\t" + Math.round(avg) + "\t" + Math.round(per));
        }
        sc.close();
    }
}
