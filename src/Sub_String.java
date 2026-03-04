import java.util.Scanner;

public class Sub_String {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // . Substring() = A method used to extract a portion of a string
        //                 String.substring(start, end)

        String email = "ali123@gmail.com";
        String username = email.substring(0,6);
        String domain = email.substring(7,16);

        String email1 = "mohammadjaffar057@gamil.com";
        String username1 = email1.substring(0,email1.indexOf("@"));
        String domain1 = email1.substring(email1.indexOf("@") + 1);

        // Taking values from the users

        String email2;
        String username2;
        String domain2;

        System.out.print("Enter you Email : ");
        email2 = sc.nextLine();

        username2 = email2.substring(0, email2.indexOf("@"));
        domain2 = email2.substring(email2.indexOf("@") + 1);

        // checking whether the email is correct
        if (email2.contains("@")){
            System.out.println(email2);
            username2 = email2.substring(0, email2.indexOf("@"));
            domain2 = email2.substring(email2.indexOf("@") + 1);

            System.out.println(username2);
            System.out.println(domain2);
        }
        else {

        }

        System.out.println(username);
        System.out.println(domain);

        System.out.println(username1);
        System.out.println(domain1);

        System.out.println(username2);
        System.out.println(domain2);

    }

}
