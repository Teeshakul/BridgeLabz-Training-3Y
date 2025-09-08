public class Vehicle {
    private static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Number: " + registrationNumber);
            System.out.println("Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150);
        Vehicle v1 = new Vehicle("Raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Danish", "SUV", "XYZ789");
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
    }
}
