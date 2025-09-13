//Devaansh Mann
//CS 5800 - Homework 1

package Inheritance;

class HourlyEmployee extends Employee {

    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String fName, String lName, String SSN, double wage, double hoursWorked) {
        super(fName, lName, SSN);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}