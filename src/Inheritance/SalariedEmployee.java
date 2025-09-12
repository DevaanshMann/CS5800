package Inheritance;

class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String fName, String lName, String SSN, double weeklySalary) {
        super(fName, lName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}