import java.util.Scanner;

public class UnitConverter3 {

    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(f));

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(c));

        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kg: " + convertPoundsToKg(pounds));

        System.out.print("Enter kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("Pounds: " + convertKgToPounds(kg));

        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));

        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));

        sc.close();
    }
}

