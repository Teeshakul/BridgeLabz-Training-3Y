import java.util.Random;

public class GenerateOTP{
    public static void main(String[] args) {
        Random r = new Random();
        int otp = 100000 + r.nextInt(900000);
        System.out.println("OTP: " + otp);
    }
}
