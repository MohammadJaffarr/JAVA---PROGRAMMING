import java.util.Scanner;

public class Printf_Statement {
    public static void main(String[] args){

        // Printf() = is a method used to format output

        // %[flag][width][.precision][specifier-character]

        String name = "Ali khan";
        char firstletter = 'A';
        int age = 23;
        double height = 1.75;
        boolean isEmployee = true;

        System.out.printf("Hello %s \n" , name);
        System.out.printf("The first latter is %c \n" , firstletter);
        System.out.printf("Your age is %d \n", age);
        System.out.printf("& your height is %f\n",height);
        System.out.printf("are you a employee %b\n",isEmployee);

        System.out.printf("Hello %s your first letter is %c and your age : %d and height : %f and you are an employee : %b",name,firstletter,age,height,isEmployee);

        //[Flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive


        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        System.out.printf("\n%.2f",price1);
        System.out.printf("\n%.2f",price2);
        System.out.printf("\n%.2f",price3);

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 234;
        int id4 = 2345;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%4d\n",id4);


    }

}
