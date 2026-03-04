import java.util.Scanner;

public class Overloaded_methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // overloaded method = methods that share the same name but different parameters
        //                      signature = name + parameters

        //04:19:55

        System.out.println(add(1,2, 3));

        sc.close();
    }
    static double add (double a , double b){
        return a + b;
    }
    static  double add (double a , double b , double c){ // same name with different parameter
        return  a + b + c;
    }
}
