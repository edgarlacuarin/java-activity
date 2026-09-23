/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalExercise;

/**
 *
 * @author User
 */
public class VehicleRentalSystem {

private String vehicleId;
private String brand;
private String model;
private int rentalDays;

// Constructor
public VehicleRentalSystem(String vehicleId, String brand, String model, int rentalDays) {
    this.vehicleId = vehicleId;
    this.brand = brand;
    this.model = model;
    this.rentalDays = rentalDays;
}


public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
}

public String getVehicleId() {
    return vehicleId;
}


public void setBrand(String brand) {
    this.brand = brand;
}

public String getBrand() {
    return brand;
}


public void setModel(String model) {
    this.model = model;
}

public String getModel() {
    return model;
}


public void setRentalDays(int rentalDays) {
    this.rentalDays = rentalDays;
}

public int getRentalDays() {
    return rentalDays;
}

// Calculate rental
public double calculateRental() {
    return 0.00;
}

// Display vehicle information
public void displayDetails() {

    System.out.println("Vehicle: " + getClass().getSimpleName());
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Rental Days: " + rentalDays);
    System.out.printf("Rental Cost: ₱%.2f%n", calculateRental());
}

}

// Car subclass
class Car extends VehicleRentalSystem {

public Car(String vehicleId, String brand, String model, int rentalDays) {
    super(vehicleId, brand, model, rentalDays);
}

@Override
public double calculateRental() {

    double rentalCost = getRentalDays() * 1500;

    if (getRentalDays() >= 7) {
        rentalCost = rentalCost * 0.90;
    }

    return rentalCost;
}

}

// Motorcycle subclass
class Motorcycle extends VehicleRentalSystem {

public Motorcycle(String vehicleId, String brand, String model, int rentalDays) {
    super(vehicleId, brand, model, rentalDays);
}

@Override
public double calculateRental() {

    double rentalCost = getRentalDays() * 700;

    // Helmet fee
    rentalCost = rentalCost + 100;

    return rentalCost;
}

}

// Van subclass
class Van extends VehicleRentalSystem {

public Van(String vehicleId, String brand, String model, int rentalDays) {
    super(vehicleId, brand, model, rentalDays);
}

@Override
public double calculateRental() {

    double rentalCost = getRentalDays() * 2500;

    // Driver fee
    rentalCost = rentalCost + 1000;

    return rentalCost;
}

}

