import java.util.Scanner;
class SmallestAndLargest {
    public static int[] find(int a, int b, int c) {
        int small = Math.min(a, Math.min(b, c));
        int large = Math.max(a, Math.max(b, c));
        return new int[]{small, large};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();
        int[] res = find(a, b, c);
        System.out.println("Smallest: " + res[0] + " Largest: " + res[1]);
        sc.close();
    }
}
