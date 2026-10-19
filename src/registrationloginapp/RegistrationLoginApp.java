/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationloginapp;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public  class RegistrationLoginApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistrationLogin rory = new RegistrationLogin();
        messaging.messaging key = new messaging(messageNumber, recipient, messageText);
    
        Scanner input = new Scanner(System.in);
        // Must contain underscore and <=5 chars
        System.out.println("Enter username");
        String username = input.nextLine();
        if(rory.checkUsername(username)){
            System.out.println("Correct");
            
        }else{
            System.out.println("InCorrect");
        }
        Scanner sacnner = new Scanner(System.in);
        // Must contain underscore and <=5 chars
        // A capital, number & special char
        System.out.println("Enter password");
        String password = input.nextLine();
        if(rory.checkUsername(username)){
            System.out.println("Correct");
            
        }else{
            System.out.println("InCorrect");
    }
    Scanner scanner = new Scanner(System.in);
        // Must contain underscore and <=5 chars
        // Contains international code (+27) and no more than 10 digits after
        // Ensure international code present
        System.out.println("Enter cellnum");
        String cellnum = input.nextLine();
        if(rory.checkUsername(cellnum)){
            System.out.println("Correct");
            
        }else{
            System.out.println("InCorrect");
}
}

    public boolean CheckCellPhoneNumber(int recipientNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    public static void message() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter message number: ");
    int messageNumber = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter recipient phone number: ");
    String recipient = scanner.nextLine();

    System.out.print("Enter message text: ");
    String messageText = scanner.nextLine();

    // Declare a new key for the messaging class
    messaging key = new messaging(messageNumber, recipient, messageText);

    System.out.println(key.printMessage());
}
    }
