class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }

    public double calculateFuelEfficiency() {
        // Default implementation (can be overridden in subclasses)
        return 0.0;
    }

    public double calculateDistance(double fuelEfficiency, double fuelConsumed) {
        return fuelEfficiency * fuelConsumed;
    }

    public double calculateMaxSpeed() {
        // Default implementation (can be overridden in subclasses)
        return 0.0;
    }
}

class Truck extends Vehicle {
    private double loadCapacity; // Additional property for trucks

    public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
        super(make, model, year, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Implement fuel efficiency calculation for trucks
        return 8.5; // Example value in miles per gallon (MPG)
    }

    @Override
    public double calculateMaxSpeed() {
        // Implement max speed calculation for trucks
        return 65.0; // Example value in miles per hour (MPH)
    }
}

class Car extends Vehicle {
    private int numberOfSeats; // Additional property for cars

    public Car(String make, String model, int year, String fuelType, int numberOfSeats) {
        super(make, model, year, fuelType);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Implement fuel efficiency calculation for cars
        return 30.0; // Example value in miles per gallon (MPG)
    }

    @Override
    public double calculateMaxSpeed() {
        // Implement max speed calculation for cars
        return 120.0; // Example value in miles per hour (MPH)
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar; // Additional property for motorcycles

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Implement fuel efficiency calculation for motorcycles
        return 50.0; // Example value in miles per gallon (MPG)
    }

    @Override
    public double calculateMaxSpeed() {
        // Implement max speed calculation for motorcycles
        return 150.0; // Example value in miles per hour (MPH)
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2022, "Gasoline", 2000.0);
        Car car = new Car("Toyota", "Camry", 2022, "Gasoline", 5);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2022, "Gasoline", false);

        System.out.println("Truck Information:");
        truck.displayInfo();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " MPG");
        System.out.println("Max Speed: " + truck.calculateMaxSpeed() + " MPH");

        System.out.println("\nCar Information:");
        car.displayInfo();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " MPG");
        System.out.println("Max Speed: " + car.calculateMaxSpeed() + " MPH");

        System.out.println("\nMotorcycle Information:");
        motorcycle.displayInfo();
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " MPG");
        System.out.println("Max Speed: " + motorcycle.calculateMaxSpeed() + " MPH");
    }
}
