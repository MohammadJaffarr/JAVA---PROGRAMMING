import java.util.Scanner;

public class Methods_in_java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Method = a block of reusable code that is executed when called ()

        String name = "ali";
        int age = 25;

        Birthday(name,age);
        Birthday(name,age);
        Birthday(name,age);

        //Method call for square of a number
        double result = square(3);
        System.out.println(result); // printing the number

        //Method call for cube of a number
        double result1 = cube(3);
        System.out.println(result1);

        //Method call for string getFullName
        String fullName = getFullName("Mohammd " , " Ali");
        System.out.println(fullName);

        sc.close();
    }

    static void Birthday(String name, int age){
        System.out.println(" Happy birthday to you!");
        System.out.printf(" Happy birthday to you dear %s! \n ", name);
        System.out.println(" Happy birthday to you ");
        System.out.printf(" you are %d year old \n ",age);
    }

    // Method to square a number
    static double square(double number){
        return number * number;
    }

    // Method to cube a number
    static  double cube(double numbers){ // parameter (double numbers)
        return  numbers * numbers * numbers;
    }

    static String getFullName (String first, String last){
        return first + " " + last; // return a value after method is complete
    }

}

