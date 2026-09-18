/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationloginapp;

/**
 *
 * @author Student
 */
class RegistrationLogin {

    public boolean checkUsername(String username) {
        if (username.length() < 5 && username.contains("_")) {
            return true;
        } else {
            return false;
        }
    }
         

    public boolean CheckPasswordComplexity(String password) {
        // TODO code application logic here
        // Characters long AND contains a capital letter AND a digital
        // A correct length
        boolean hasLength = password.length() >= 8;
        boolean hasNumbers = password.matches(".*[0-9]*");
        boolean hasUpper = password.matches(".*[A-Z]*.");
        boolean hasSpecial = password.chars().anyMatch(c -> !Character.isLetterOrDigit(c));
        return hasLength && hasNumbers && hasUpper && hasSpecial;
    }

    public boolean CheckCellPhoneNumber(String CheckCellPhoneNumber ) {
        // TODO: use a regular expression to check the cell phone number
        // Starts with the South African international code  + 27 and is the
        // correct length
        if (CheckCellPhoneNumber.startsWith("+27") && CheckCellPhoneNumber.length() == 12){
        return false;
    }else 
         return true;
    }

    public String registerUser( String username, String passwor, String cellum){
        
        if(CheckUserName(username)){
            return "incorrect username";
        }else if (CheckCellPhoneNumber(cellnum)){
            return "incorrect password";
    }else if (CheckPasswordComplexity(passwor)){
            return"incorrect";
    }
    // TODO: use a regular expression to check the cellphone number
    // Starts with the South African International code and is the
    // Correct length
        }
    
    public boolean loginUser(String enteredUsername, String entredPassword, String correctUsername, String correctpassword) {
        if(correctUsername.equals(correctUsername)&& correctpassword.equals (correctpassword)){
            return true;
    }else
            return false;
        
    }

    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Welcome! It is great to see you again";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

}
