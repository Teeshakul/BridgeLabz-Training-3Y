import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c], b = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) a[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) b[i][j] = sc.nextInt();
        int[][] sum = new int[r][c], diff = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) {
            sum[i][j] = a[i][j] + b[i][j];
            diff[i][j] = a[i][j] - b[i][j];
        }
        System.out.println("Sum:");
        for (int[] row : sum) { for (int v : row) System.out.print(v + " "); System.out.println(); }
        System.out.println("Diff:");
        for (int[] row : diff) { for (int v : row) System.out.print(v + " "); System.out.println(); }
        sc.close();
    }
}
