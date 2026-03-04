
import java.util.Scanner;

public class Maths {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(Math.PI); // we can directly get the PI value using Math.PI
        System.out.println(Math.E);

        // to use maths we have to use Maths.
        double result;
        result = Math.pow(2,3); // For power
        result = Math.abs(-5); // For absolute value
        result = Math.sqrt(9); // For Square root
        result = Math.round(3.14); // For round up
        result = Math.ceil(3.14); // For round up to celling
        result = Math.floor(3.99); // For round to the floor
        result = Math.max(18, 20); // For max between two
        result = Math.min(10,20); // For min between two

        System.out.println(result);


        // HYPOTENUSE c = Math.sqrt ( a^2 + b^2 )
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A : ");
        a = sc.nextDouble();

        System.out.print("Enter the length of side B : ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print("The hypotenuse (side C ) is : " + c  + " cm");


        // circumference = 2 * Math.pPI * radius ;
        // area = Math.PI * Math.pow(radius, 2) ;
        // volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3) ;

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("\n Enter the radius : ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;

        area = Math.PI * Math.pow(radius,2);

        volume = (4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3);

        System.out.println(circumference);
        System.out.println(area);
        System.out.printf("%.2f",volume);// we can use printf to limit the point value and must use , and don't use +

        // 01:42:33 BRO code next topic is printf
        sc.close();
    }
}
