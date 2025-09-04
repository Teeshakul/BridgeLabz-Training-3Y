import java.util.Scanner;

public class NumberChecker5 {
    static int sumDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum;
    }
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumDivisors(n);
        boolean perfect = sum == n;
        boolean abundant = sum > n;
        boolean deficient = sum < n;
        int temp = n, strongSum = 0;
        while (temp > 0) { strongSum += fact(temp % 10); temp /= 10; }
        boolean strong = strongSum == n;
        System.out.println("Perfect: " + perfect);
        System.out.println("Abundant: " + abundant);
        System.out.println("Deficient: " + deficient);
        System.out.println("Strong: " + strong);
        sc.close();
    }
}
