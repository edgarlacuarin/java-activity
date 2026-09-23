/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalExercise;

/**
 *
 * @author User
 */
public class VehicleMain {
    public static void main(String[] args) {
        VehicleRentalSystem[] vehicles = {
            new Car("C001","Toyota","Vois",7),new Motorcycle("M001","Honda","Click 125",3),new Van("V001","Toyota","Haice",2)};
        
        System.out.println("=====VIHICLE RENTAL======");
        System.out.println();
        
        for(VehicleRentalSystem vehicle : vehicles){
            vehicle.displayDetails();
        }
    }
    
}
