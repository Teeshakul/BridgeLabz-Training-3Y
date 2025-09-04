import java.util.Scanner;

public class MatrixAdvancedOperations {
    static int det2(int[][] m) { return m[0][0]*m[1][1] - m[0][1]*m[1][0]; }
    static int det3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) m[i][j] = sc.nextInt();
        System.out.println("Transpose:");
        for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) System.out.print(m[j][i] + " "); System.out.println(); }
        if (n == 2) System.out.println("Determinant: " + det2(m));
        if (n == 3) System.out.println("Determinant: " + det3(m));
        sc.close();
    }
}
