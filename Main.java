/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity5;

/**
 *
 * @author User
 */
public class Main {
    // Main Class
    public static void main(String[] args) {
        // Polymorphism: Storing child class objects inside an array of parent class reference type
        InternetPlan[] subscriptions = new InternetPlan[] {
            new StandardPlan("P-101", "Ana Reyes", 12),
            new BasicPlan("P-102", "Juan Dela Cruz", 8),
            new PremiumPlan("P-103", "Maria Santos", 15),
            new BasicPlan("P-104", "Mark Tan", 3)
        };

        // Iterating and invoking polymorphic methods
        for (InternetPlan plan : subscriptions) {
            plan.displaySubscription();
        }
    }
}

