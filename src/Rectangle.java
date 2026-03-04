import java.util.Scanner;

public class Rectangle{
    public static void main (String[] args){
        // Calculate the area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the width : ");
        width = sc.nextDouble();

        System.out.println(" enter the height : ");
        height = sc.nextDouble();

        area = width * height;

        System.out.println( " The area is : " + area + "cm");
    }
}