import java.util.Scanner;
class ChocolateDistribution {
    public static int[] distribute(int n, int m) {
        return new int[]{n / m, n % m};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int n = sc.nextInt();
        System.out.print("Enter number of children: ");
        int m = sc.nextInt();
        int[] res = distribute(n, m);
        System.out.println("Each child gets: " + res[0] + " Remaining: " + res[1]);
        sc.close();
    }
}
