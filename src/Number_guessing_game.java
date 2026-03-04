import java.util.Scanner;
import java.util.Random;

public class Number_guessing_game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // NUMBER GUESSING GAME

        Random random = new Random();

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,11);

        System.out.println("NUMBER GUESSING GAME ");
        System.out.println("Enter a number between 1 -10 : ");

        do {
            System.out.print("Enter a guess : ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("Two low ! try again");
            } else if (guess > randomNumber) {
                System.out.println("To high ! try again");
            }
            else {
                System.out.println("you got it Bro " + randomNumber);
                System.out.println("Total attemps is : " + attempts);
            }

        }while(guess != randomNumber);

        System.out.println("you have won");

        sc.close();
    }
}
