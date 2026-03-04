import java.util.Scanner;

public class String_method {
    public static void main(String[] args){

        String name = " Mohammad jaffar";

        int length = name.length(); // gives the total length of name ( how many words are there )
        char letter = name.charAt(0); // show at the given index what latter is present
        int index = name.indexOf("j");
        int lastindex = name.lastIndexOf("f");

        name = name.toUpperCase();
        name = name.toLowerCase();

        name = name.trim();
        name = name.replace("m","j");

        System.out.println(length);

        if(name.equals("Password")){
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello " + name);
        }
    }

}
