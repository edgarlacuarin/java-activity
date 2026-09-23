/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalExercise;

/**
 *
 * @author User
 */
public class WaterBillManagementSystem {

    // Private properties (Encapsulation)
    private String accountNumber;
    private String customerName;
    private String customerType; // "Residential" or "Commercial"
    private double previousReading;
    private double currentReading;

    // Constructor
    public WaterBillManagementSystem(String accountNumber, String customerName, String customerType, double previousReading, double currentReading) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    // Getters and Setters
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getCustomerType() { return customerType; }
    public void setCustomerType(String customerType) { this.customerType = customerType; }

    public double getPreviousReading() { return previousReading; }
    public void setPreviousReading(double previousReading) { this.previousReading = previousReading; }

    public double getCurrentReading() { return currentReading; }
    public void setCurrentReading(double currentReading) { this.currentReading = currentReading; }

    // Methods
    public double calculateConsumption() {
        return currentReading - previousReading;
    }

    public double getRate() {
        double consumption = calculateConsumption();

        if (customerType.equalsIgnoreCase("Residential")) {
            if (consumption <= 10) {
                return 15.00;
            } else if (consumption <= 20) {
                return 18.00;
            } else {
                return 22.00;
            }
        } else if (customerType.equalsIgnoreCase("Commercial")) {
            if (consumption <= 10) {
                return 20.00;
            } else if (consumption <= 20) {
                return 25.00;
            } else {
                return 30.00;
            }
        }
        return 0.0;
    }

    public double calculateBill() {
        return calculateConsumption() * getRate();
    }

    public String getClassification() {
        double consumption = calculateConsumption();
        if (consumption <= 10) {
            return "Low Consumption";
        } else if (consumption <= 20) {
            return "Moderate Consumption";
        } else {
            return "High Consumption";
        }
    }

    public void displayBill() {
        double consumption = calculateConsumption();

        System.out.println("===== WATER BILL =====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Type: " + customerType);
        System.out.printf("Previous Reading: %.0f%n", previousReading);
        System.out.printf("Current Reading: %.0f%n", currentReading);
        System.out.printf("Consumption: %.0f m³%n", consumption);
        System.out.printf("Rate: ₱%.2f%n", getRate());
        System.out.printf("Total Bill: ₱%.2f%n", calculateBill());
        System.out.println("Classification: " + getClassification());

        // Additional warning condition
        if (consumption > 30) {
            System.out.println("WARNING: HIGH WATER CONSUMPTION");
        }
        System.out.println();
    }
}
