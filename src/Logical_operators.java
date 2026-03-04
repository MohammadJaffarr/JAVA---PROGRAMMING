import java.util.Scanner;

public class Logical_operators {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // && = AND
        // || = OR
        // ! = NOT

        // username must be between 4 - 12 characters
        // username must not contain spaces or underscore

        String username;

        System.out.print("Enter your new Username : " );
        username = sc.nextLine();

        if ( username.length() < 4 || username.length() > 12 ){
            System.out.println("Username must be between 4 - 12 characters");

        }
        else if ( username.contains(" ") || username.contains("_") ){
            System.out.println("Username must not contains spaces or underscores ");
        }
        else {
            System.out.println("Welcome " + username);
        }

        sc.close();
    }
}
