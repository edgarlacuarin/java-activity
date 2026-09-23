/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalExercise;

/**
 *
 * @author User
 */
public class WaterBillMain {

    public static void main(String[] args) {
        // Object 1: Sample from prompt
        WaterBillManagementSystem bill1 = new WaterBillManagementSystem("W-1001", "Maria Santos", "Residential", 120, 145);
        
        // Object 2: High consumption Commercial (> 30 m³ to trigger warning)
        WaterBillManagementSystem bill2 = new WaterBillManagementSystem("W-1002", "Juan Dela Cruz", "Commercial", 200, 240);
        
        // Object 3: Low consumption Residential
        WaterBillManagementSystem bill3 = new WaterBillManagementSystem("W-1003", "Ana Reyes", "Residential", 50, 58);

        // Display all bills
        bill1.displayBill();
        bill2.displayBill();
        bill3.displayBill();
    }
}


