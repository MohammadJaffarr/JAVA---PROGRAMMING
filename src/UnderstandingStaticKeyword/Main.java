package UnderstandingStaticKeyword;

public class Main {
    public static void main(String[] args){

        // static = Make a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resource

        Friend friend1 = new Friend("Ali khan");
        System.out.println(friend1.name);
        System.out.println(Friend.numOfFriends);

        Friend.show();
    }
}
