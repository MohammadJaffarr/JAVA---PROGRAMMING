import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //03: 59: 39 matrix program

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the no of rows : ");
        rows = sc.nextInt();

        System.out.print("Enter the no of columns : ");
        columns = sc.nextInt();

        System.out.println("Enter the symbol to use : ");
        symbol = sc.next().charAt(0);

        for (int i =0 ; i < columns ; i++){
            System.out.print(symbol + " ");
            for (int j = 0 ; j < rows ; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
