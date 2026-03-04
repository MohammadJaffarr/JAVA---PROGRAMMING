import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // array = a collection of values of the same data types
        //          a variable that can store more than 1 value

        String[] fruits = {"apple","orange","Mango"};

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        System.out.println(fruits[1]);

        for (int i =0 ; i < fruits.length ; i++ ){
            System.out.println(fruits[i]);
        }
        //Sorting the array
        Arrays.sort(fruits);

        //Enhanced for loop
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
