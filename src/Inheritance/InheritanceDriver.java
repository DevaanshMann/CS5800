package Inheritance;

public class InheritanceDriver {
    public static void main(String[] args) {
        SalariedEmployee e1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee e2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee e3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee e4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee e5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee e6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee e7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-777", 22, 40000);


        System.out.println(e1.getFName() + " " + e1.getlName() + " " + e1.getSSN() + " $" + e1.getWeeklySalary());
        System.out.println(e2.getFName() + " " + e2.getlName() + " " + e2.getSSN() + " " + e2.getWage() + " " + e2.getHoursWorked());
        System.out.println(e3.getFName() + " " + e3.getlName() + " " + e3.getSSN() + " " + e3.getWage() + " " + e3.getHoursWorked());
        System.out.println(e4.getFName() + " " + e4.getlName() + " " + e4.getSSN() + " " + e4.getCommissionRate() + " " + e4.getGrossSales());
        System.out.println(e5.getFName() + " " + e5.getlName() + " " + e5.getSSN() + " " + e5.getWeeklySalary());
        System.out.println(e6.getFName() + " " + e6.getlName() + " " + e6.getSSN() + " " + e6.getBaseSalary());
        System.out.println(e7.getFName() + " " + e7.getlName() + " " + e7.getSSN() + " " + e7.getCommissionRate() + " " + e7.getGrossSales());
    }
}