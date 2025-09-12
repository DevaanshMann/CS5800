package Interface;

import java.text.DecimalFormat;

class Freelancer implements Payable {
    private String FName;
    private String LName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String fName, String lName, double hourlyRate, double hoursWorked) {
        this.FName = fName;
        this.LName = lName;
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);

    }

    public void setHourlyRate(double rate) {
        if (hourlyRate >= 0.0) {
            this.hourlyRate = rate;

        } else {
            throw new IllegalArgumentException("Hourly Rate must be non-negative");
        }
    }

    public void setHoursWorked(double hours) {
        if (hoursWorked >= 0.0) {
            this.hoursWorked = hours;

        } else {
            throw new IllegalArgumentException("Hours worked must be non-negative");
        }
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculatePayment() {
        if (hoursWorked <= 40){
            return hourlyRate * hoursWorked;
        } else{
            double basePay = 40 * hoursWorked;
            double overtimePay = (hoursWorked - 40) * hourlyRate + 1.5;
            return basePay + overtimePay;
        }
    }

    @Override
    public String getPayeeName() {
        return FName + " " + LName;
    }

    public void print(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Freelancer: " + getPayeeName());
        System.out.println("Calculated Payment: " +  df.format(calculatePayment()));
    }
}
