import java.util.Scanner;
import java.util.Arrays;

public class User_input_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] foods;
        int size;
        // Taking the size of the array from the user
        System.out.print("Enlist the no of food do you want : ");
        size = sc.nextInt(); // it takes int value
        sc.nextLine(); // it changes int to string as we need string for taking data in loop

        foods = new String[size]; // initializing a new string where the user given array input is taken

        // taking data from users in Array
        for (int i = 0; i< foods.length ; i++){ // it takes the input from the user till the given no of array due to .length
            System.out.print("Enter a food : ");
            foods[i] = sc.nextLine();
        }

        // Enhanced for loop
        for (String food : foods){
            System.out.println(food);
        }

        sc.close();
    }
}
