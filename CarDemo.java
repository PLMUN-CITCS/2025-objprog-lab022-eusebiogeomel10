// Define the Car class
class Car {
    // Attributes (data fields)
    String make;
    String model;
    int year;

    // Constructor to initialize car attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class to run the program
public class Main { // Programiz requires the main class to be named Main
    public static void main(String[] args) {
        // Create a Car object using the constructor
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Call the method to display car information
        myCar.displayInfo();
    }
}
