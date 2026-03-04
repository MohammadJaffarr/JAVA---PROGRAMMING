import  java.util.Scanner;

public class Banking_program {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        // java Banking program

        // Declare variables
        double balance = 0;
        boolean isRunning =true;
        int choice;

        // Display a menu
        while (isRunning){
            System.out.println("----------------");
            System.out.println("Banking program");
            System.out.println("----------------");
            System.out.println("1 . show balance");
            System.out.println("2 . deposit");
            System.out.println("3 . withdraw");
            System.out.println("4 . Exit");


            // Get and process users choice
            System.out.println("Enter your choice (1-4) : ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance =+ deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice : ");
            }
            System.out.println("Thank you for using ");
        }
        // show balance ()

        // deposit ()

        // withdraw ()

        // EXIT message

    }

    static void showBalance(double balance){
        System.out.println("----------------");
        System.out.printf("$%.2f \n",balance);
    }
    static double deposit(){

        System.out.print(" Enter an amount to be deposited : ");
        double amount;
        amount = sc.nextDouble();
        if (amount < 0 ){
            System.out.println("Amount can't be negative ");
            return  0;
        }else {
            System.out.println(amount);
        }
        return  amount;
    }

    static double withdraw (double balance) {

        double amount;

        System.out.print(" Enter amount to be withdrawn : ");
        amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("insufficient amount ! ");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative ! ");
            return 0;
        } else {
            return amount;
        }
    }

}
