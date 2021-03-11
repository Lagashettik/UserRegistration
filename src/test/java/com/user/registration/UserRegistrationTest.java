package com.user.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationValidation User = new UserRegistrationValidation();

    @Test
    public void ValidFirstNameTest(){
        boolean result = User.ValidateFirstName.validate("Krishna");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidFirstNameTest(){
        boolean result = User.ValidateFirstName.validate("krishna");
        Assert.assertFalse(result);
    }

    @Test
    public void ValidLastNameTest(){
        boolean result = User.ValidateLastName.validate("Krishna");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidLastNameTest(){
        boolean result = User.ValidateLastName.validate("krishna");
        Assert.assertFalse(result);
    }

    @Test
    public void ValidEmailTest(){
        boolean result = User.ValidateEmail.validate("Gameplay@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidEmailTest() throws UserRegistrationException{
        boolean result = User.ValidateEmail.validate("gameplaygmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void ValidPasswordTest(){
        boolean result = User.ValidatePassword.validate("Gameplay@123");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidPasswordTest(){
        boolean result = User.ValidatePassword.validate("gameplay@123");
        Assert.assertFalse(result);
    }

    @Test
    public void ValidMobileNumberTest(){
        boolean result = User.ValidateMobileFormat.validate("91 9632587410");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidMobileNumberTest(){
        boolean result = User.ValidateMobileFormat.validate("915232587410");
        Assert.assertFalse(result);
    }
}
