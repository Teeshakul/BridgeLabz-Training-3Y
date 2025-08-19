import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = new int[10];
        int maxIndex = 10, index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxIndex) {
                    maxIndex *= 2;
                    int[] temp = new int[maxIndex];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
