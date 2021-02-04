import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
    String RegexFirstLastName = "^[A-Z]{1}[a-z]{2}[a-z]*";  //For First and Last Name Regex is same
    String RegexEmail = "^[a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]*[a-zA-z]{2})+$";
    String RegexMobileFormat ="^(\\d{2}[ ]{1})[6-9]{1}[0-9]{9}$";
    String RegexPassword = "^(?=.*[A-Z])(?=.*[0-9])([A-za-z0-9]).{8,}$";

    static int choice;
    static Scanner scan = new Scanner(System.in);

    Boolean CheckPattern(String Pat){

        String Details;
        Details = scan.next();
        if(choice == 4)
            Details=Details+" "+scan.next();

        Pattern pat = Pattern.compile(Pat);
        Matcher match = pat.matcher(Details);
        boolean result;
        result = match.matches();
        return result;
    }

    void Choice(UserRegistration User) {

        System.out.println("1 : Firstname\n2 : Lastname\n3 : Email\n4 : Mobile Number\n5 : Password");
        System.out.println("Enter your choice");
        choice = scan.nextInt();
        System.out.println("Enter Details");

        switch (choice) {
            case 1 -> Firstname(User);
            case 2 -> Lastname(User);
            case 3 -> Email(User);
            case 4 -> MobileFormat(User);
            case 5 -> Password(User);
            default -> System.out.println("exit");
        }
    }

    void Firstname(@NotNull UserRegistration User){
        boolean check = CheckPattern(User.RegexFirstLastName);
        if (check)
            System.out.println("First Name is Valid");
        else
            System.out.println("First Name is Invalid");
    }

    void Lastname(UserRegistration User){
        boolean check = CheckPattern(User.RegexFirstLastName);
        if (check)
            System.out.println("Last Name is Valid");
        else
            System.out.println("Last Name is Invalid");
    }

    void Email(UserRegistration User){
        boolean check = CheckPattern(User.RegexEmail);
        if (check)
            System.out.println("Email is Valid");
        else
            System.out.println("Email is Invalid");
    }

    void MobileFormat(UserRegistration User){
        boolean check = CheckPattern(User.RegexMobileFormat);
        if (check)
            System.out.println("Mobile Number is Valid");
        else
            System.out.println("Mobile Number is Invalid");
    }

    void Password(UserRegistration User){
        boolean check = CheckPattern(User.RegexPassword);
        if (check)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }

    public static void main(String[] args) {
        UserRegistration User = new UserRegistration();
        User.Choice(User);
    }
}