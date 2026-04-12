package UnderstandingStaticKeyword;

public class Friend {

    static int numOfFriends;

    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void  show(){
        System.out.println("you have " + numOfFriends + " total friends");
    }

}
