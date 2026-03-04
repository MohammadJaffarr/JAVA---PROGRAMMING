import java.util.Scanner;
import java.util.Arrays;

public class Search_in_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // how to search the elements of an array

            int[] number = { 1, 2,3,4, 5 ,6 ,7 };
            int target = 2;
            boolean isFound = false;


            for (int i =0 ; i<number.length; i++){
                if (target == number[i]){
                    System.out.println("Element found at index : " + i);
                    isFound = true;
                    break;
                }
            }
            if (!isFound){
                System.out.println("The element is not found in the array ");
            }

            // array for string
            String[] fruits = { "apple", "banana", "orange"," mango"};
            String search ="banana";
            // for string array search
            for (int i =0; i <fruits.length; i++){
                if (fruits[i].equals(search)){
                    System.out.println("Element found at index : " + i);

                    break;
                }
            }

        sc.close();
    }
}
