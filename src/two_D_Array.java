import java.util.Scanner;
import java.util.Arrays;

public class two_D_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 2D array = An array where each element is an array
        //             useful for storing a matrix of data

        String[] fruits = {"apple", "banana", "mango"};
        String[] vegetables = {"potato", "carrot", "onion"};
        String[] meats = {"Chicken", "beef", "fish"};

        String[][] groceries = { fruits, vegetables, meats};

        for (String[] foods : groceries){
            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
