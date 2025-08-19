public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;
        double km3 = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double miles3 = km3 / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + km3 +
                           " and cubic miles is " + miles3);
    }
}
