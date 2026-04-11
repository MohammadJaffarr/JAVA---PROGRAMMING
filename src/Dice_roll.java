import java.util.Scanner;
import java.util.Random;

public class Dice_roll {
    public static void main(String[] args){
        // Scanner class for taking the input from user
        // you have to import java.util.Scanner; 
        Scanner sc = new Scanner(System.in);
        // Random for random inputs
        // you have to import java.util.Random;
        Random random = new Random();

        // java dice roll program

        int numOfDice;
        int total = 0;

        System.out.println("Enter the no of Dice to roll : ");
        numOfDice = sc.nextInt();

        if (numOfDice > 0){

            for (int i =0 ; i < numOfDice ; i++){
                // here 1 is included and 7 is ecluded means there is (1,2,3,4,5,6)
                // taking random no from 1 - 7 using Random object
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled : " + roll);
                total += roll;
            }
            System.out.println("Total : " + total);
        }else {
            System.out.println("no of Dice must be greater then zero");
        }
        sc.close();
    }
    // Display the ASCII art
    static  void printDie(int roll){
        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
               """;
        String dice2 = """
                -------
               | ●     |
               |       |
               |     ● |
                -------
               """;
        String dice3 = """
                -------
               | ●     |
               |   ●   |
               |     ● |
                -------
               """;
        String dice4 = """
                -------
               | ●   ● |
               |       |
               | ●   ● |
                -------
               """;
        String dice5 = """
                -------
               | ●   ● |
               |   ●   |
               | ●   ● |
                -------
               """;
        String dice6 = """
                -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
                -------
               """;
        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }

    }

}
