import java.util.Scanner;

public class For_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // for loop = execute some code a CERTAIN amount of times

        //incrementing by 1
        for (int i = 0 ; i < 10 ; i++)
        {
            System.out.println(i);
        }

        //incrementing by 2
        for (int x = 0 ; x < 10 ; x+=2){
            System.out.println(x);
        }

        System.out.print("Enter how many times you want to loop : ");
        int max = sc.nextInt();

        for (int i =0 ; i <= max ; i++)
        {
            System.out.println(i);
        }


        sc.close();
    }
}
