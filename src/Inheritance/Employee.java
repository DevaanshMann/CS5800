//Devaansh Mann
//CS 5800 - Homework 1

package Inheritance;

class Employee {
    private String fName;
    private String lName;
    private String SSN;

    public Employee(String fName, String lName, String SSN) {
        this.fName = fName;
        this.lName = lName;
        this.SSN = SSN;
    }

    public String getFName() {
        return fName;
    }
    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSSN() {
        return SSN;
    }
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}







