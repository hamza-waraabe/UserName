import java.util.Scanner;
/** 
 * @author haa2224
 * purpose 
 Write a Java Program to Authenticate a user login for Username and Password.

If username and password is correct then display "Welcome Username!" message.

Else display "Wrong Username or Password!" message.

Requirements:

 Write comments for Java doc

 Write Flowchart

 Write Pseudocode

 Use VI to write and complie on Terminal

 Use gitbash to submit your work on github.com

 Generate Java Doc
 */


public class UserName {
public static void main (String[] args){
	Scanner keyboard = new Scanner(System.in);
	String cUserName , cpassword;
	cUserName = "haa2224" ;
	cpassword = "wutang97";
	System.out.println("Enter UserName");
	String UserName = keyboard.next();
	
	System.out.println("Enter password");
	String password = keyboard.next();
	
	
	
	 if (cUserName.equals(UserName) && cpassword.equals(password)){
		 System.out.println("Welcome" + UserName);
	 }
	 else 
		 System.out.println("Wrong username or password");
	 {
keyboard.close();
	 }}
}
	 


	 
	 
		 		
	
	
	
	
	
	



