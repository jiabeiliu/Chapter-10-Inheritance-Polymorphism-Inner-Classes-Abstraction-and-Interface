public class Ship extends Vehicle {
    private double displacement;
    private int passengerCapacity;

    public Ship(String make, String model, int year, double displacement, int passengerCapacity) {
        super(make, model, year);
        this.displacement = displacement;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ship - Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear()
                + ", Displacement: " + displacement + " tonnes, Passenger Capacity: " + passengerCapacity);
    }
}
