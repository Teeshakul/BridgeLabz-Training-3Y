import java.util.Scanner;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        int sum = 0, sumSq = 0;
        for (int d : digits) { sum += d; sumSq += Math.pow(d, 2); }
        boolean harshad = num % sum == 0;
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        System.out.println("Sum: " + sum);
        System.out.println("SumSquares: " + sumSq);
        System.out.println("Harshad: " + harshad);
        for (int[] f : freq) if (f[1] > 0) System.out.println(f[0] + " -> " + f[1]);
        sc.close();
    }
}
