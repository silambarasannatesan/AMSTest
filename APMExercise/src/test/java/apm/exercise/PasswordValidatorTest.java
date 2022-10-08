package apm.exercise;

import apm.exercise.exception.InvalidPasswordException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class PasswordValidatorTest {

    @Before
    public void setup(){
    }

    @Test
    public void testPasswordLength() throws InvalidPasswordException {
        boolean isPasswordLengthValid = PasswordValidator.isValid("TestPasswordLength");
        assertFalse(String.valueOf(isPasswordLengthValid),false);
    }
	
	 @Test
    public void testPasswordisNull() throws InvalidPasswordException {
        boolean isPasswordNotNull = PasswordValidator.isValid(null);
        assertFalse(String.valueOf(isPasswordNotNull),false);
    }
	
	 @Test
    public void testPasswordHasNoCaps() throws InvalidPasswordException {
        boolean isPasswordHasValidCaps = PasswordValidator.isValid("tespPasswordlength");
        assertFalse(String.valueOf(isPasswordHasValidCaps),false);
    }

 }
