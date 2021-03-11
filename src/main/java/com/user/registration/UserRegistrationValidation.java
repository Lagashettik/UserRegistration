package com.user.registration;

import java.util.regex.Pattern;

public class UserRegistrationValidation {
    UserRegistration User = new UserRegistration();

    UserValidator ValidateFirstName = (s) -> (Pattern.compile(User.RegexFirstLastName).matcher(s).matches());

    UserValidator ValidateLastName = (s) -> (Pattern.compile(User.RegexFirstLastName).matcher(s).matches());

    UserValidator ValidateEmail = (s) -> (Pattern.compile(User.RegexEmail).matcher(s).matches());

    UserValidator ValidateMobileFormat = (s) -> (Pattern.compile(User.RegexMobileFormat).matcher(s).matches());

    UserValidator ValidatePassword = (s) -> (Pattern.compile(User.RegexPassword).matcher(s).matches());


    @FunctionalInterface
    interface UserValidator{
        boolean validate(String s);
    }

}