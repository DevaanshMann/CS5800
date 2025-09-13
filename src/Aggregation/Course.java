package Aggregation;

import java.util.ArrayList;

public class Course {
    private String cName;
    private ArrayList<Instructor> Inst;
    private ArrayList<Textbook> tBook;

    public Course(String courseName) {
        this.cName = courseName;
        this.Inst = new ArrayList<>();
        this.tBook = new ArrayList<>();
    }

    public String getCourseName() {
        return cName;
    }
    public void setCourseName(String courseName) {
        this.cName = courseName;
    }
    public void addInstructor(Instructor instructor) {
        this.Inst.add(instructor);
    }
    public void addTextbook(Textbook textbook) {
        this.tBook.add(textbook);
    }

    public void print(){
        System.out.println("Course Name: " + this.cName);

        System.out.println("Instructor:" );
        for (Instructor inst : this.Inst) {
            System.out.println("  " +  inst.getFName() + " " + inst.getLName() + " Office Number: " + inst.getOfficeNo());
        }
        System.out.println("Textbook:" );
        for (Textbook tBook : this.tBook) {
            System.out.println("  " +  tBook.getTitle() + " by " + tBook.getAuthor() + " Publisher: " + tBook.getPublisher());
        }
    }
}




// FOR PERSONAL REFERENCE

//    private Instructor inst;            // can string be used?
//    private Textbook tbook;
//        this.inst = instructor;
//        this.tbook = textbook;

//    public Instructor getInstructor() {
//        return inst;
//    }
//    public void setInstructor(Instructor instructor) {
//        this.inst = instructor;
//    }
//    public Textbook getTextbook() {
//        return tbook;
//    }
//    public void setTextbook(Textbook textbook) {
//        this.tbook= textbook;
//    }

//        System.out.println("Instructor: " + inst.getFName() + " " + inst.getLName());
//        System.out.println("Textbook: " + tbook.getTitle() + " by " + tbook.getAuthor());