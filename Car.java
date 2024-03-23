public class Car extends Vehicle {
    private int seatingCapacity;
    private double engineSize;

    public Car(String make, String model, int year, int seatingCapacity, double engineSize) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
        this.engineSize = engineSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear()
                + ", Seating Capacity: " + seatingCapacity + ", Engine Size: " + engineSize + "L");
    }
}
