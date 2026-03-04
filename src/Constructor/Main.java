package Constructor;

public class Main {
    public static void main(String[] args){

        // Constructor = A special method to initialize objects
        //               you can pass arguments to a constructor
        //               and set initial values

        Student student1 = new Student("Ali", 30, 9.2 );
        Student student2 = new Student("Khan", 24, 8.9);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

    }
}
