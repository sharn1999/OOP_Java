package Task2;

public class Car {
    public enum FuelType {
        GASOLINE, DIESEL, ELECTRIC
    }

    private static int carCount = 0;
    private final String make;
    private final String model;
    private final int year;
    private final FuelType fuelType;

    {
        carCount++;
    }

    public Car(String make, String model, int year, FuelType fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " (" + fuelType + ")";
    }

    public static int getCarCount() {
        return carCount;
    }

    public void startEngine() {
        System.out.println("Starting the engine of a " + this.toString());
    }
    public void startEngine(String ignitionType) {
        System.out.println("Starting the engine of a " + this.toString() + " with " + ignitionType + " ignition");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022, FuelType.GASOLINE);
        Car car2 = new Car("Tesla", "Model 3", 2023, FuelType.ELECTRIC);

        System.out.println(car1);
        System.out.println(car2);

        car1.startEngine();
        car2.startEngine("keyless");

        System.out.println("Total number of cars: " + Car.getCarCount());
    }
}