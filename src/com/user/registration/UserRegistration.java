package com.user.registration;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
    public String RegexFirstLastName = "^[A-Z]{1}[a-z]{2}[a-z]*";  //For First and Last Name Regex is same
    public  String RegexEmail = "^([a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]*[a-zA-z]{2})+$";
    public String RegexMobileFormat ="^(\\d{2}[ ]{1})[6-9]{1}[0-9]{9}$";
    public String RegexPassword = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]{1})([A-za-z0-9]).{8,}$";

    static int choice;
    static String Details = " ";
    static Scanner scan = new Scanner(System.in);

    Boolean CheckPattern(String Pat) {

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

        System.out.println("1 : Firstname\n2 : Lastname\n3 : Email\n4 : Mobile Number\n5 : Password\n6 : Clear Email");
        System.out.println("Enter your choice");
        choice = scan.nextInt();
        System.out.println("Enter Details");

        switch (choice)  {

                case 1 -> Firstname(User);
                case 2 -> Lastname(User);
                case 3 -> Email(User);
                case 4 -> MobileFormat(User);
                case 5 -> Password(User);
                case 6 -> ClearEmail();
                default -> System.out.println("exit");
        }
    }

    void Firstname(@NotNull UserRegistration User) {
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

    void ClearEmail(){
        if(Details != " ") {
            if (CheckEmail(Details))
                Details = null;
        }
        else
            System.out.println("Email is empty");
    }

    boolean CheckEmail(String Email){
        Pattern pat = Pattern.compile(RegexEmail);
        Matcher match = pat.matcher(Email);
        boolean result;
        result = match.matches();
        return result;
    }

    public static void main(String[] args) {
        UserRegistration User = new UserRegistration();
        User.Choice(User);
    }
}