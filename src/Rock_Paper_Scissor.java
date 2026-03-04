import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ROCK PAPER SCISSORS GAME

        Random random = new Random();

        String[] choices = {"ROCK ", "PAPER", " SCISSORS"};
        String player ;
        String Computer;
        String playAgain = "yes";

        do {


            System.out.print("Enter your move ( ROCK , PAPER , SCISSORS ) : ");
            player = sc.nextLine().toUpperCase();

            if (!player.equals("ROCK") && !player.equals("PAPER") && !player.equals("SCISSORS")){
                System.out.println("Enter the valid choice !!");
                continue;
            }

            // this method of a random object return a number between 0 - 2
            //  ## 0 -> ROCK  ## 1 -> PAPER  ## 2 -> SCISSORS
            Computer = choices[random.nextInt(3)];
            System.out.println("Computer choice is : " + Computer);

            // WIN CONDITIONS

            if (player.equals(Computer)){
                System.out.println("It's a TIE ");
            }
            else if (player.equals("ROCK") && Computer.equals("SCISSORS")) {
                System.out.println(" You WIN ");
            }
            else if (player.equals("PAPER") && Computer.equals("ROCK")) {
                System.out.println(" You WIN ");
            }
            else if (player.equals("SCISSORS") && Computer.equals("PAPER")) {
                System.out.println(" You WIN ");
            }
            else {
                System.out.println("You LOSE ");
            }

            System.out.print("Play Again ( Yes / No ) : ");
            playAgain = sc.nextLine().toUpperCase();

        }while (playAgain.equals("YES"));

        sc.close();
    }
}
