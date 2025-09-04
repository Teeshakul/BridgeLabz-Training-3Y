import java.util.Scanner;

public class NumberChecker1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        boolean duck = s.contains("0") && s.charAt(0) != '0';
        int pow = digits.length, arm = 0;
        for (int d : digits) arm += Math.pow(d, pow);
        int largest = digits[0], secondLargest = -1;
        int smallest = digits[0], secondSmallest = 10;
        for (int d : digits) {
            if (d > largest) { secondLargest = largest; largest = d; }
            else if (d > secondLargest && d != largest) secondLargest = d;
            if (d < smallest) { secondSmallest = smallest; smallest = d; }
            else if (d < secondSmallest && d != smallest) secondSmallest = d;
        }
        System.out.println("Duck: " + duck);
        System.out.println("Armstrong: " + (arm == num));
        System.out.println("Largest: " + largest + " SecondLargest: " + secondLargest);
        System.out.println("Smallest: " + smallest + " SecondSmallest: " + secondSmallest);
        sc.close();
    }
}
