   class Car {
    // Defining attributes or properties of the Car class
    String make;
    String model;
    int year;
    // Defining a method to display information about the car
    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
public class Exam1 {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();
        
        // Assigning values to the attributes of the object
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2020;
        
        // Calling the method to display information about the car
        myCar.displayInfo();
    }
}
