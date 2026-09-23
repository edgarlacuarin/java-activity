/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalExercise;

/**
 *
 * @author User
 */
public class EmployeePayrollSystem {

// Properties
private String employeeId;
private String name;
private String position;
private double hoursWorked;
private double hourlyRate;

// Constructor
public EmployeePayrollSystem(String employeeId, String name, String position,
                double hoursWorked, double hourlyRate) {

    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
}

// Getters and Setters
public String getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getPosition() {
    return position;
}

public void setPosition(String position) {
    this.position = position;
}

public double getHoursWorked() {
    return hoursWorked;
}

public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
}

public double getHourlyRate() {
    return hourlyRate;
}

public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
}

// Calculate regular pay
public double calculateRegularPay() {
    double regularHours = Math.min(hoursWorked, 40);
    return regularHours * hourlyRate;
}

// Calculate overtime pay
public double calculateOvertimePay() {
    if (hoursWorked > 40) {
        double overtimeHours = hoursWorked - 40;
        double overtimeRate = hourlyRate * 1.50;

        return overtimeHours * overtimeRate;
    }

    return 0.00;
}

// Calculate gross pay
public double calculateGrossPay() {
    return calculateRegularPay() + calculateOvertimePay();
}

// Calculate deduction
public double calculateDeduction() {
    double grossPay = calculateGrossPay();

    if (grossPay <= 10000) {
        return grossPay * 0.05;
    } else {
        return grossPay * 0.10;
    }
}

// Calculate net pay
public double calculateNetPay() {
    return calculateGrossPay() - calculateDeduction();
}

// Get employee classification
public String getEmployeeClassification() {
    if (hoursWorked < 20) {
        return "Part-Time";
    } else if (hoursWorked <= 40) {
        return "Regular";
    } else {
        return "Overtime Worker";
    }
}

// Display payroll
public void displayPayroll() {

    System.out.println("===== EMPLOYEE PAYROLL =====");
    System.out.println("Employee ID: " + employeeId);
    System.out.println("Name: " + name);
    System.out.println("Position: " + position);
    System.out.println();

    System.out.println("Hours Worked: " + (int) hoursWorked);
    System.out.printf("Hourly Rate: ₱%.2f%n", hourlyRate);
    System.out.println();

    System.out.printf("Regular Pay: ₱%.2f%n", calculateRegularPay());
    System.out.printf("Overtime Pay: ₱%.2f%n", calculateOvertimePay());
    System.out.printf("Gross Pay: ₱%.2f%n", calculateGrossPay());
    System.out.println();

    System.out.printf("Deduction: ₱%.2f%n", calculateDeduction());
    System.out.printf("Net Pay: ₱%.2f%n", calculateNetPay());
    System.out.println();

    System.out.println("Classification: " + getEmployeeClassification());
}

}