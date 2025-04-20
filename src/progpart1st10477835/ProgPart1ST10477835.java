/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progpart1st10477835;
import java.util.Scanner;
/**
 *
 * @author abule
 */
public class ProgPart1ST10477835 {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login newUser = new Login();
        newUser.registerUser();
    }  
}
class Login{
public static String userName;
    public static String password;
    public static String cellPhoneNumber;
    public static String firstName;
    public static String lastName;
    public static boolean registrationStatus = false;
    public static boolean loginStatus;
    //global variables allow us to store values and modify or use them through out our program.
    
    public static boolean checkUserName(String userName){
        return userName.length()<=5 && userName.contains("_");
    }//The method checks if the given username is at most 5 characters long and contains at least one underscore
    public static boolean checkPasswordComplexity(String password){
        if(password.length()>=8){
            return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).+$");
        }else{
            return false;
        }
    }//The method first checks if the password is atleast 8 characters long then checks if the password contains atleast one capital letter, one digit and one special character
    public static boolean checkCellPhoneNumber(String phoneNumber){
        return phoneNumber.matches("^(\\+27|0)\\d{9}$");
    }//The method makes sure that the cellphone number starts with the international countrey code and is the correct length
    public static String registerUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a first name: ");
        firstName = scanner.next();
        System.out.print("Please enter a last name: ");
        lastName = scanner.next();
        
        System.out.print("Please enter a username: ");
        userName = scanner.next();
        while(!checkUserName(userName)){
            System.out.println("Username is not correctly formatted, "+ 
            "please ensure that your username contains an underscore "+
            "and is no more than 5 characters in length.");
            System.out.print("Please enter a username: ");
            userName = scanner.next();
        }//while loop will run as long as the username does not match the condition specified in checkUserName().
        System.out.println("Username successfully captured.");
        
        System.out.println("Welcome "+firstName+", "+lastName+" it is great to see you.");
        
        System.out.print("Please enter a password: ");
        password = scanner.next();
        while(!checkPasswordComplexity(password)){
            System.out.println("Password is not correctly "+
            "formatted, please ensure that the password "+
            "contains at least 8 characters, a capital "+
            "letter, a number and a special character.");
            System.out.print("Please enter a password: ");
            password = scanner.next();
        }//while loop will run as long as the password does not match the condition specified in checkPasswordComplexity().
        System.out.println("Password successfully captured.");
        
        System.out.print("Please enter your cellphone number: ");
        cellPhoneNumber = scanner.next();
        while(!checkCellPhoneNumber(cellPhoneNumber)){
            System.out.println("Cell phone number incorrectly "+
            "formatted or does not contain international code.");
            System.out.print("Please enter your phone number: ");
            cellPhoneNumber = scanner.next();
        }//while loop will run as long as the cellphone number does not match the condition specified in checkCellPhoneNumber().
        System.out.println("Cell phone number successfully added.");
        registrationStatus = true;
        return "Successful registration";
    }//The method will register the user, saving information such as their firstname, lastname, username and password (according to the conditions specified)l.
    
    public static boolean loginUser(String tempUserName, String tempPassword){
        Scanner scanner = new Scanner(System.in);
        if(registrationStatus && !loginStatus){
            if(tempPassword!=password||tempUserName!=userName){
                System.out.println("Username or password incorrect, please try again.");
                loginStatus = false;
                return false;
            }else{
                System.out.println("Welcome "+firstName+", "+lastName+" it is great to see you again.");
                loginStatus = true;
                return true;
            }
        }else{
            System.out.println("Registration hasn't been completed or login has alrady been completed");
            loginStatus = false;
            return false;
        }
    }//will verify if the username and password match the saved username and password.
    public static String returnLoginStatus(){
        return (loginStatus) ? "A successful login" : "A failed login";
    }//return the login status. If the login was successful will return successful and if failed will return failed.
}