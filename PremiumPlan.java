/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity5;

/**
 *
 * @author User
 */
class PremiumPlan extends InternetPlan {
    public PremiumPlan(String planCode, String customerName, int monthsSubscribed) {
        super(planCode, customerName, 2499.00, monthsSubscribed);
    }

    @Override
    public double getDiscountRate() {
        return (getMonthsSubscribed() >= 12) ? 0.15 : 0.0;
    }

    @Override
    public double calculateMonthlyBill() {
        return getMonthlyFee() * (1 - getDiscountRate());
    }

    @Override
    public String getSpeed() {
        return "300 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Premium";
    }
}
