public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 5, 2.5);
        Motorbike motorbike = new Motorbike("Honda", "CBR500R", 2019, false);
        Aircraft aircraft = new Aircraft("Boeing", "747", 1990, 35000, 416);
        Ship ship = new Ship("Royal Caribbean", "Symphony of the Seas", 2018, 228081, 6680);

        car.displayInfo();
        motorbike.displayInfo();
        aircraft.displayInfo();
        ship.displayInfo();
    }
}
