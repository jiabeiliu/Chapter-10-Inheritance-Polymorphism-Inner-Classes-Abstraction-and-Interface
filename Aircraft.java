public class Aircraft extends Vehicle {
    private int maxAltitude;
    private int seatingCapacity;

    public Aircraft(String make, String model, int year, int maxAltitude, int seatingCapacity) {
        super(make, model, year);
        this.maxAltitude = maxAltitude;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Aircraft - Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear()
                + ", Max Altitude: " + maxAltitude + " feet, Seating Capacity: " + seatingCapacity);
    }
}
