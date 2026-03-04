import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // break = break out of a loop ( STOP )
        // continue = skip current iteration of a loop ( SKIP )


        // break ( Stop )
         for (int i = 0 ; i < 10 ; i++ ){
             if (i == 5){
                 break;
             }
             System.out.println(i + "");
         }

         // continue ( Skip )
         for (int i = 0 ; i < 10; i ++){
             if (i == 5){
                 continue;
             }
             System.out.println(i + "");
         }

        sc.close();
    }

}
