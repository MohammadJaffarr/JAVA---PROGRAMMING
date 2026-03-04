import java.util.Scanner;

public class If_statement {
    public static void main(String[] args){

        // if statement  = performs a block of code if its condition is true


        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        System.out.print("Enter your name : ");
        name = sc.nextLine();

        System.out.print("Enter your age : ");
        age = sc.nextInt();


        //GROUP 1 for name String
        if (name.isEmpty()){
            System.out.print("You didn't enter you name !");
        } else{
            System.out.print("Hello "  + name );
        }

        //GROUP 2 for age Int
        if (age >= 65){
            System.out.print("You are a senior !");
        } else if (age >= 18 ) {
            System.out.print("you are an adult !");
        } else if (age < 0 ) {
            System.out.print("You haven't been born yet !");
        } else if (age == 0 ) {
            System.out.print ("You are a baby");
        }
        else {
            System.out.print("!");
        }

        sc.close();
    }
}
