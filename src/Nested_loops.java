import java.util.Scanner;

public class Nested_loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // nested loop = A loop inside another loop
        //      used often with matrices or DSA

        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
