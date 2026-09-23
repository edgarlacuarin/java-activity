/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity5;

/**
 *
 * @author User
 */
class BasicPlan extends InternetPlan {
    public BasicPlan(String planCode, String customerName, int monthsSubscribed) {
        super(planCode, customerName, 999.00, monthsSubscribed);
    }

    @Override
    public double getDiscountRate() {
        return (getMonthsSubscribed() >= 6) ? 0.05 : 0.0;
    }

    @Override
    public double calculateMonthlyBill() {
        return getMonthlyFee() * (1 - getDiscountRate());
    }

    @Override
    public String getSpeed() {
        return "50 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Basic";
    }
}
