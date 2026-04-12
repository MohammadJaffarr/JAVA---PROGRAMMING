package ArrayOfObject;

public class Car {

    String model;
    String color;

    Car(String model , String color){
        this.model = model;
        this.color = color;

    }

    void drive(){
        System.out.println("you drive the " + model + " with this color : " + color);

    }
}