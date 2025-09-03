import java.util.Scanner;
class QuotientAndRemainder {
    public static int[] find(int a, int b) {
        return new int[]{a / b, a % b};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.print("Enter divisor: ");
        int b = sc.nextInt();
        int[] res = find(a, b);
        System.out.println("Quotient: " + res[0] + " Remainder: " + res[1]);
        sc.close();
    }
}
