public class Operators {
    public static void main(String[] args){

        // Arithmetic operators

        int x = 10;
        int y = 2;
        int z;

        // z = x + y;
        // z = x - y;
        // z = x * y;
        // z = x / y;
        // z = x % y;

        z = x + y;
        System.out.println("The addition of " + x + " + " + y +" = " + z);


        // Augmented assignment operators
        int a = 10 ;
        int b = 5;
        // a += b;
        // a -= b;
        // a *= b;
        // a /= b;
        // a %= b;
        a += b;
        System.out.println(a);

        // Increment and Decrement operators
        int c = 1 ;
         c++;
         c++;
         c++;
        System.out.println(c);

        int d =1;
        d--;
        d--;
        d--;
        System.out.println(d);

        // Order of Operations [ P - E - M - D - A - S ]
        // P => Parenthesis
        // E => Exponent
        // M => Multiplication
        // D => Division
        // A => Addition
        // S => Subtraction

        double result = 3+ 4 * ( 7 -5) / 2.0;
        System.out.println(result);

    }
}
