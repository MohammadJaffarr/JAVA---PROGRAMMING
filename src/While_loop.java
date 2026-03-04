import java.util.Scanner;

public class While_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // While loop = repeat some code forever
        //          while some condition remains true

        String name = "";

        while( name.isEmpty() ){
            System.out.print( "Enter your name : " );
            name = sc.nextLine();
        }

        System.out.println( "Hello " + name);

        int age = 0;
        System.out.print( "Enter your age : " );
        age = sc.nextInt();

        while( age < 0 ) {
            System.out.println( "Your age can't be negative " );
            System.out.print( "Enter your age : " );
            age = sc.nextInt();

        }
        System.out.println( "You are " + age + " year's old" );

        int number = 0;
        do{
            System.out.print( "Enter a number between 1 - 10 : " );
            number = sc.nextInt();
        }while ( number < 1 || number > 10 );

        System.out.println( "You picked " + number );

        sc.close();

    }
}
