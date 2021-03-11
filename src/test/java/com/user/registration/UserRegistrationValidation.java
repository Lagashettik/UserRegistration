package com.user.registration;

import java.util.regex.Pattern;

public class UserRegistrationValidation {
    UserRegistration User = new UserRegistration();

    public boolean ValidateFirstName(String FirstName) {
        Pattern pattern = Pattern.compile(User.RegexFirstLastName);
        return pattern.matcher(FirstName).matches();
    }

    public boolean ValidateLastName(String LastName) {
        Pattern pattern = Pattern.compile(User.RegexFirstLastName);
        return pattern.matcher(LastName).matches();
    }

    public boolean ValidateEmail(String Email) {
        Pattern pattern = Pattern.compile(User.RegexEmail);
        return pattern.matcher(Email).matches();
    }

    public boolean ValidateMobileFormat(String MobileNumber) {
        Pattern pattern = Pattern.compile(User.RegexMobileFormat);
        return pattern.matcher(MobileNumber).matches();
    }

    public boolean ValidatePassword(String Password) {
        Pattern pattern = Pattern.compile(User.RegexPassword);
        return pattern.matcher(Password).matches();
    }
}