import java.util.Scanner;

public class DiscountFeeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fee: ");
        int fee = sc.nextInt();
        System.out.print("Enter discount percent: ");
        int discountPercent = sc.nextInt();

        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
