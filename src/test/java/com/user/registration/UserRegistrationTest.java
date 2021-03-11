package com.user.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationValidation User = new UserRegistrationValidation();

    @Test
    public void ValidFirstNameTest() throws UserRegistrationException {
        boolean result = User.ValidateFirstName("Krishna");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidFirstNameTest() throws UserRegistrationException{
        boolean result = User.ValidateFirstName("krishna");
        Assert.assertFalse(result);
    }

    @Test
    public void ValidLastNameTest() throws UserRegistrationException{
        boolean result = User.ValidateLastName("Krishna");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidLastNameTest() throws UserRegistrationException{
        boolean result = User.ValidateLastName("krishna");
        Assert.assertFalse(result);
    }

    @Test
    public void ValidEmailTest() throws UserRegistrationException{
        boolean result = User.ValidateEmail("Gameplay@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidEmailTest() throws UserRegistrationException{
        boolean result = User.ValidateEmail("gameplaygmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void ValidPasswordTest() throws UserRegistrationException{
        boolean result = User.ValidatePassword("Gameplay@123");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidPasswordTest() throws UserRegistrationException{
        boolean result = User.ValidatePassword("gameplay@123");
        Assert.assertFalse(result);
    }

    @Test
    public void ValidMobileNumberTest() throws UserRegistrationException{
        boolean result = User.ValidateMobileFormat("91 9632587410");
        Assert.assertTrue(result);
    }

    @Test
    public void InvalidMobileNumberTest() throws UserRegistrationException{
        boolean result = User.ValidateMobileFormat("915232587410");
        Assert.assertFalse(result);
    }
}
