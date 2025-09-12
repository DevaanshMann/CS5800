package Aggregation;

public class Course {
    private String cName;
    private Instructor inst;            // can string be used?
    private Textbook tbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.cName = courseName;
        this.inst = instructor;
        this.tbook = textbook;
    }

    public String getCourseName() {
        return cName;
    }
    public void setCourseName(String courseName) {
        this.cName = courseName;
    }
    public Instructor getInstructor() {
        return inst;
    }
    public void setInstructor(Instructor instructor) {
        this.inst = instructor;
    }
    public Textbook getTextbook() {
        return tbook;
    }
    public void setTextbook(Textbook textbook) {
        this.tbook= textbook;
    }

    public void print(){
        System.out.println("Course Name: " + this.cName);
        System.out.println("Instructor: " + inst.getFName() + " " + inst.getLName());
        System.out.println("Textbook: " + tbook.getTitle() + " by " + tbook.getAuthor());
    }
}
