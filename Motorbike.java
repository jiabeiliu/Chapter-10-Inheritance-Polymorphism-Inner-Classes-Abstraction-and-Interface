public class Motorbike extends Vehicle {
    private boolean hasSidecar;

    public Motorbike(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorbike - Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear()
                + ", Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
