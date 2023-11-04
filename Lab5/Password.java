/*Brayden Coghill
300347436
October 18, 2023
Sarah Foss
This program has a user enter a password and checks the password to see if it meets certain standards.
 */

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean validPassword = false;
        //while validPassword is false it asks for a password from user
        while(!validPassword){ 
            System.out.print("Enter a password: ");
            String password = in.nextLine();
            //if isValid is met it turns validPassword to true and prints "Valid password"
            if(isValid(password)){
                System.out.println("Valid password.");
                validPassword = true;
            }

        }
    }

    public static boolean isValid(String password){
        boolean valid = true; //Starts true and turns false if if statement is met
        //checking length of password
        if(password.length() < 8){
            System.out.println("Passwords must be at least 8 characters long.");
            valid = false;
        } 
        //Check to see if password is "password"
        if(password.toLowerCase().contains("password")){
            System.out.println("Password cannot contain the word \"password\".");
            valid = false;
        }
        //creating booleans to check true or false value
        boolean containsNumber = false;
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsSpecialCharacter = false;
        //checking for numbers between 0 and 9
        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            
            if(Character.isDigit(c)){
                containsNumber = true;
            }else if(Character.isUpperCase(c)){
                containsUpperCase = true;
            }else if(Character.isLowerCase(c)){
                containsLowerCase = true;
            }else if(!Character.isLetterOrDigit(c)){
                containsSpecialCharacter = true;
            }
        }

        if (!containsNumber){
            System.out.println("Passwords must contain a number.");
            valid = false;
        } 
        //Checking for uppercase letters
        if(!containsUpperCase){
            System.out.println("Passwords must contain at least one uppercase character.");
            valid = false;
        }
        //Checkin for lower case letters
        if(!containsLowerCase){
            System.out.println("Passwords must contain at least one lowercase character.");
            valid = false;
        }
        //checking to make sure there are no special characters
        if(containsSpecialCharacter){
            System.out.println("Password cannot have a special character in it.");
            valid = false;
        }
        return valid; //This hurt my brain
    } 
}