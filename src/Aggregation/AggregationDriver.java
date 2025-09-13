//Devaansh Mann
//CS 5800 - Homework 1

package Aggregation;

public class AggregationDriver {
    public static void main(String[] args) {

        Instructor inst1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor inst2 = new Instructor("Jane", "Doe", "1-2345");

        Textbook tBook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook tBook2 = new Textbook("Design Patterns", "Erich Gamma", "Addison-Wesley");

        Course cs5800 = new Course("CS 5800");

        // used add methods to add both instructors and textbooks
        cs5800.addInstructor(inst1);
        cs5800.addInstructor(inst2);

        cs5800.addTextbook(tBook1);
        cs5800.addTextbook(tBook2);

        cs5800.print();
    }
}


//public class AggregationDriver {
//    public static void main(String[] args) {
//
//        Instructor inst1 = new Instructor("Nima", "Davarpanah", "3-2636");
//        Textbook tBook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
//        Course cs5800 =  new Course("CS5800", inst1, tBook1);
//        cs5800.print();
//
//        System.out.println();
//    }
//}