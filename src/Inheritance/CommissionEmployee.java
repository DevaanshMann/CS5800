package Inheritance;

class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String fName, String lName, String SSN, double commissionRate, double grossSales) {
        super(fName, lName, SSN);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}