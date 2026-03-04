// A program for random numbers
// for random numbers we have to import Random
import java.util.Random;
// For Radom class

public class Random_number {
    public static void main(String[] args){
        Random random = new Random();

        int number;
        int number1;
        int number2;

        // this will generate a random number
        number = random.nextInt();
        // it gives a large number very large
        number = random.nextInt(1,7);
        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1,7);

        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);

        // we can also generate random doubles

        double value;
        value = random.nextDouble();
        System.out.println("\n" + value);

    }
}
