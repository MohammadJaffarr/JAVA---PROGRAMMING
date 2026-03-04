import java.util.Scanner;

public class Enhnaced_switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Enhanced switch = A replacement to many else if statements
        //       ( Java 14 feature )



        String day;
        System.out.print("Enter the day of week : ");
        day = sc.next();
        switch(day){
            case "Monday" -> System.out.println("It's a week day ");
            case "Tuesday" -> System.out.println("It's a week day ");
            case "Wednesday" -> System.out.println("It's a week day ");
            case  "Thursday" -> System.out.println("It's a week day ");
            case "Friday" -> System.out.println("It's a week day ");
            case "Saturday" -> System.out.println("It's a weekend");
            case "Sunday" -> System.out.println("It's a weekend");
            default -> System.out.println("It's not a day");
        }


        sc.close();
    }
}
