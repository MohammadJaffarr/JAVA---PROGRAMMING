package ArrayOfObject;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car("Thar" , "Red");
        Car c2 = new Car("Defender" , " Black");
        Car c3 = new Car("Alto 800 ", " White");

        // Car[] cars = new Car[3];
        Car[] cars = {c1,c2,c3};

        for (int i =0 ; i< cars.length ; i++){
            cars[i].drive();
        }

        sc.close();
    }
}