public  class Main{
    public static void main (String[] args){

        // variable : it is a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // Primitive = simple values stored directly in memory ( known as stack)
        // reference = memory address ( stack ) that points to the ( heap )

        // Primitive data types : int , double, char, boolean
        // Reference data types : string , array , object


            // this is single line comment
            /* this is multiline comment*/

        System.out.println("Hello");
        System.out.println(" java programming");
        System.out.println("\n lets start it ");
        // sout for print shortcut

        // variables
        // primitive data types

        int age; // declaration
        age = 21; // initialization
        System.out.println(age);

        int year = 2025;
        System.out.println("THe year is "  + year);


        double price = 19.99;
        double gpa = 3.5;
        System.out.println(price);
        System.out.println(gpa);

        char grade = 'A';
        char symbol = '@';
        System.out.println(grade);
        System.out.println(symbol);

        boolean isStudent = true;
        boolean isAdult = true;

        System.out.println(isAdult);
        System.out.println(isStudent);
        // and some more datatypes like short float etc

        if(isStudent == true){
            System.out.println("you are student");

        }
        else {
            System.out.println("you are not the student");
        }

        // Reference data type

        String name = "Mohammad Jaffar";
        System.out.println("Hello " +  name); // concatinate

        String food = "Pizza";

        System.out.println("Your favorite food is " + food);

        String email = "Fake123@gmail.com";
        System.out.println("Your email is : " + email);
    }
}