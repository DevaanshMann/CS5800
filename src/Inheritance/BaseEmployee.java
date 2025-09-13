//Devaansh Mann
//CS 5800 - Homework 1

package Inheritance;

class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String fName, String lName, String SSN, double commissionRate) {
        super(fName, lName, SSN);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}


