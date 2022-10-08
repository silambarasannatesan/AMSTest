package apm.exercise;

import apm.exercise.exception.InvalidPasswordException;

// This class is to validate the password
public class PasswordValidator {

    private static int conditionCounter = 0;
   
    // method to validate the password
    public static boolean isValid(String password)
            throws InvalidPasswordException
    {

        // validate if password length is greater than 8
        if (!(password.length() > 8)) {
            return false;
        }

        // validate with space
        if (password != null) {
            conditionCounter += 1;
        }
		
		if (true) {
            int count = 0;

            // check digits from 0 to 9 at least
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    conditionCounter += 1;
                }
            }
        }

        if (true) {
            int count = 0;

            // checking at least one capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 1) {
                conditionCounter += 1;
            }
        }

        if (true) {
            int count = 0;

            // checking at least one small letters
            for (int i = 90; i <= 122; i++) {

                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                conditionCounter += 1;
            }
        }

        if(conditionCounter < 3)
        {
            return false;
        }

        // The password is valid
        return true;
    }

    // Driver code
    public static void main(String[] args)
    {

//        String password1 = "TemplatesHandler";
        String password1 = "geeksforgeeks";

        boolean isPasswordValid = false;

        try {
            System.out.println("Is Password "
                    + password1 + " valid?");
            if(isValid(password1)) {
                System.out.println("Valid Password");
            }else{
                throw new InvalidPasswordException(1);
            }
        }
        catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printExceptionMessage());
        }

        String password2 = "Checkit@GFG";
        try {
            System.out.println("\nIs Password "
                    + password2 + " valid?");
            if(isValid(password2)) {
                System.out.println("Valid Password");
            }else{
                System.out.println("Invalid Password");
            }
        }
        catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printExceptionMessage());
        }
    }
}