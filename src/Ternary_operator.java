import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ternary operator ? = return1 of 2 values if a condition is true

        // variable = ( Condition ) ? ifTrue : ifFalse;

        int score = 70;
        String passOrFail = ( score >= 60 ) ? "Pass " : "Fail";

        System.out.println(passOrFail);

        int number =3;
        String evenOrOdd = ( number % 2 == 0 ) ? "EVEN " : " ODD";
        System.out.println(evenOrOdd);


    }
}
