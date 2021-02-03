import java.util.*;
import java.util.regex.*;

public class UserRegistration {
    String RegexFirstName = "^[A-Z]{1}[a-z]{2}[a-z]*";


    Boolean CheckPattern(String Pat, String Details){
        Pattern pat = Pattern.compile(Pat);
        Matcher match = pat.matcher(Details);
        boolean result = match.matches();
        return result;
    }

    public static void main(String[] args) {
        UserRegistration User = new UserRegistration();
        Scanner scan = new Scanner(System.in);
        String Details = scan.next();
        if(User.CheckPattern(User.RegexFirstName,Details) == true)
            System.out.println("First Name is Valid");
        else
            System.out.println("First Name is Invalid");

    }
}
