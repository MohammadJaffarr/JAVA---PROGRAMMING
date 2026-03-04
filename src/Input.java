import java.util.Scanner;
// this is necessary
public class Input {
    public static void main(String[] args){
        // how to take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");

        String name = sc.nextLine(); // reads a string of character with space
            // for a string of character without space we can use sc.next();

        System.out.println("Hello " + name);

        // for integer data type taking data from the user we can use sc.nextInt();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println(name + " your age is " + age); // concatinating : joining two or more data type

        // for double data type taking data from user we can use sc.nextDouble();
        System.out.println(" Enter you GPA : ");
        double gpa = sc.nextDouble();
        System.out.println(name + " Gpa is : " + gpa );

        // for boolean data type taking data from the user we can use sc.nextBoolean();
        System.out.println( " are you a student ( true / False) ");
        boolean isStudent = sc.nextBoolean();
        System.out.println("Student : " + isStudent);
        // 39:51 bro code java full course for free

        sc.close();

    }
}
