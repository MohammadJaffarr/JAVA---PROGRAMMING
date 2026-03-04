import java.util.Scanner;

public class Varargs {
    public static void main(String[] args){

        // varargs = allow a method to accept a varying number of arguments
        //          makes methods more flexible, no need for overloaded methods
        //          java will pack the arguments into an array
        //           =>   ... (ellipsis)


        // overloaded methods are methods that shares the same name but different parameters

        //method call
        // here we can make any no arguments
        System.out.println(add(1, 2, 3, 4, 5));

        // we can pass any no of argument
        System.out.println(average(1,2,3,4));
    }
    // a method
    // java will pack the arguments into an array

    static int add(int... numbers){

        int sum = 0;

        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
    // arrays
    static double average(double... numberss){
        double sum = 0;
        for (double number : numberss){
            sum += number;
        }
        return sum / numberss.length;
    }

}
