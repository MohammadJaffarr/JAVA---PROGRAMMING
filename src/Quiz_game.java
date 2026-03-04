// important to understand the use of arrays and shoeing out put using loops and nested statements


import java.util.Scanner;
import java.util.Arrays;

public class Quiz_game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Java Quiz game program

        // Questions
        String[] questions = { "What is the main function of a router ? ",
                                "Which part of the computer is considered the brain ?",
                                "What year waa Facebook launched ? ",
                                "Who is known as the father of computer ?",
                                "What was the first programming language ?"};

        // Options
        String[][] options  ={  {"1. Storing files","2. Encrypting data", "3. Directing internet traffic"},
                                {"1. CPU","2. Hard Drive", "3. RAM", "4. GPU"},
                                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                                {"1. Steve jobs", "2. Bill gates", "3. Alen turing","4. Charles Babbage"},
                                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
                            };

        //Correct answer or KEY
        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess ;


        // welcome message
        System.out.println("=================================");
        System.out.println(" Welcome to the Java quiz game !!");
        System.out.println("=================================");

        // for loop to show the questions
        // using the length of array to define the no of questions
        for(int i = 0 ; i < questions.length; i++){
            System.out.println(questions[i]);

            // Enhance for loop for showing the options to each question
            for (String option : options[i]){
                System.out.println(option);
            }

            // taking guess from the user
            System.out.print("Enter your guess : ");
            guess = sc.nextInt();

            if (guess == answers[i]){
                System.out.println("----------------");
                System.out.println(" Correct answer ");
                System.out.println("----------------");
                // after getting the correct answer we can increment the score by one
                score++;
            }
            else {
                System.out.println("--------------");
                System.out.println(" wrong answer ");
                System.out.println("--------------");
            }
        }

        // Displaying the score

        System.out.println("Your Final score is : " + score + " out of " + questions.length);

        sc.close();
    }
}
