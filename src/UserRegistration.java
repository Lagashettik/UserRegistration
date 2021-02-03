import java.util.*;
import java.util.regex.*;

public class UserRegistration {
    String RegexFirstLastName = "^[A-Z]{1}[a-z]{2}[a-z]*";  //For First and Last Name Regex is same
    String RegexEmail = "^([a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]*[a-zA-z]{2})+$";

    Boolean CheckPattern(String Pat, String Details){

        Pattern pat = Pattern.compile(Pat);
        Matcher match = pat.matcher(Details);
        boolean result;
        result = match.matches();
        return result;
    }

    void Choice(UserRegistration User) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 : Firstname\n2 : Lastname\n3 : Email");
        System.out.println("Enter your choice");
        int choice = scan.nextInt();
        System.out.println("Enter Details");
        String Details = scan.next();
        boolean check;
        switch (choice) {
            case 1 -> {
                check = CheckPattern(User.RegexFirstLastName, Details);
                if (check)
                    System.out.println("First Name is Valid");
                else
                    System.out.println("First Name is Invalid");
            }
            case 2 -> {
                check = CheckPattern(User.RegexFirstLastName, Details);
                if (check)
                    System.out.println("Last Name is Valid");
                else
                    System.out.println("Last Name is Invalid");
            }
            case 3 -> {
                check = CheckPattern(User.RegexEmail, Details);
                if (check)
                    System.out.println("Email is Valid");
                else
                    System.out.println("Email is Invalid");
            }
            default -> System.out.println("exit");
        }

    }
    public static void main(String[] args) {
        UserRegistration User = new UserRegistration();
        User.Choice(User);
    }
}
