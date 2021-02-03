import java.util.*;
import java.util.regex.*;

public class UserRegistration {
    String RegexFirstLastName = "^[A-Z]{1}[a-z]{2}[a-z]*";  //For First and Last Name Regex is same

    Boolean CheckPattern(String Pat, String Details){
        Pattern pat = Pattern.compile(Pat);
        Matcher match = pat.matcher(Details);
        boolean result = match.matches();
        return result;
    }

    void Choice(UserRegistration User){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 : Firstname\n2 : Lastname");
        System.out.println("Enter your choice");
        int choice = scan.nextInt();
        System.out.println("Enter Details");
        String Details = scan.next();

        switch (choice){
            case 1:
                if(CheckPattern(User.RegexFirstLastName,Details) == true)
                    System.out.println("First Name is Valid");
                else
                    System.out.println("First Name is Invalid");
                break;
            case 2:
                if(CheckPattern(User.RegexFirstLastName,Details) == true)
                    System.out.println("Last Name is Valid");
                else
                    System.out.println("Last Name is Invalid");
                break;
            default:
                System.out.println("exit");
        }
    }
    public static void main(String[] args) {
        UserRegistration User = new UserRegistration();
        User.Choice(User);
    }
}
