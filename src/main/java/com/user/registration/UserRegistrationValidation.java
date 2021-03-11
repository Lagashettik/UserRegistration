package com.user.registration;

import java.util.regex.Pattern;

public class UserRegistrationValidation {
    UserRegistration User = new UserRegistration();

    public boolean ValidateFirstName(String FirstName) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(User.RegexFirstLastName);
            return pattern.matcher(FirstName).matches();
        }
        catch (Exception e){
            throw new UserRegistrationException("invalid entry");
        }
    }

    public boolean ValidateLastName(String LastName) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(User.RegexFirstLastName);
            return pattern.matcher(LastName).matches();
        }
        catch (Exception e){
            throw new UserRegistrationException("invalid entry");
        }
    }

    public boolean ValidateEmail(String Email) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(User.RegexEmail);
            return pattern.matcher(Email).matches();
        }
        catch (Exception e){
            throw new UserRegistrationException("invalid entry");
        }
    }

    public boolean ValidateMobileFormat(String MobileNumber) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(User.RegexMobileFormat);
            return pattern.matcher(MobileNumber).matches();
        }
        catch (Exception e){
            throw new UserRegistrationException("invalid entry");
        }
    }

    public boolean ValidatePassword(String Password) throws UserRegistrationException {
        try{Pattern pattern = Pattern.compile(User.RegexPassword);
        return pattern.matcher(Password).matches();
    }
        catch (Exception e){
            throw new UserRegistrationException("invalid entry");
        }
    }
}