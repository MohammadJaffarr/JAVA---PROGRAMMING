package Constructor;

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // constructor
    // the parameter of a constructor can be different from  attributes name
    Student(String name , int age, double gpa) {
        // this refers to the object that we are currently working with
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;

    }

}
