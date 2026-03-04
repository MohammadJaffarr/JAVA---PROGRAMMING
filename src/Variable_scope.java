import java.util.Scanner;

public class Variable_scope {
//    static int x = 3; // CLASS VARIABLE

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // variable scope = where a variable can be accessed

        int x = 1 ; // LOCAL VARIABLE

        System.out.println(x);
        doSomething();

        sc.close();
    }
    static  void doSomething(){
        int x =2 ; // LOCAL VARIABLE

        System.out.println(x);
    }
}
