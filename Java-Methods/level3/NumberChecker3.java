import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) rev[i] = digits[digits.length - 1 - i];
        boolean palindrome = Arrays.equals(digits, rev);
        boolean duck = s.contains("0") && s.charAt(0) != '0';
        System.out.println("Palindrome: " + palindrome);
        System.out.println("Duck: " + duck);
        sc.close();
    }
}
