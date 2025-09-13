//Devaansh Mann
//CS 5800 - Homework 1

package Aggregation;

public class Instructor {
    private String fName;
    private String lName;
    private String officeNo;

    public Instructor(String fName, String lName, String officeNo) {
        this.fName = fName;
        this.lName = lName;
        this.officeNo = officeNo;
    }

    public String getFName() {
        return fName;
    }
    public void setFName(String fName) {
        this.fName = fName;
    }
    public String getLName() {
        return lName;
    }
    public void setLName(String lName) {
        this.lName = lName;
    }
    public String getOfficeNo() {
        return officeNo;
    }
    public void setOfficeNo(String officeNo) {
        this.officeNo = officeNo;
    }

}
