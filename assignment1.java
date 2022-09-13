/*
 * Class: CMSC203 
 * Instructor: Dr.Kuijt
 * Description: Build an application that will step through some possible problems to restore internet connectivity.  Assume that your computer uses wi-fi to connect to a router which connects to an Internet Service Provider (ISP) which connects to the Internet.
 * Due: 09/12/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Arvind Awasthi
*/


package assignment1;


import java.util.*;

public class assignment1 {

	final static String QUESTION = "Did that fix the problem? (Yes or No)";
	final static String INVALID = "Invalid answer; try again?";
	
	String userInput = "";
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in); 
	
	
	System.out.println("If you have a problem with Internet connectivity this WiFi Diagnosis might work.\n\n");
	System.out.println("Reboot the computer and try to connect.");
	System.out.println(QUESTION);
	
	String userInput = keyboard.nextLine();
	userInput = userInput.toLowerCase();
	
	if (userInput.equals("yes")) {
		System.out.println("Done.");
		System.out.println("Programmer: Arvind Awasthi");
		keyboard.close();
		return;
	} else if (userInput.equals("no")){
		System.out.println("Reboot the router and try to connect.");
		System.out.println(QUESTION);
		
		userInput = keyboard.nextLine();
		userInput = userInput.toLowerCase();
	} else {
		System.out.println("Invalid answer; try again.");
		System.out.println("Programmer: Arvind Awasthi");
		keyboard.close();
		return;
	}
		if (userInput.equals("yes")) {
			System.out.println("Done.");
			System.out.println("Programmer: Arvind Awasthi");
			keyboard.close();
			return;
		
	} else if (userInput.equals("no")){
		System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router.");
		System.out.println(QUESTION);
		
		userInput = keyboard.nextLine();
		userInput = userInput.toLowerCase();
	} else {
		System.out.println("Invalid answer; try again.");
		System.out.println("Programmer: Arvind Awasthi");
		keyboard.close();
		return;
	}
		if (userInput.equals("yes")) {
			System.out.println("Done.");
			System.out.println("Programmer: Arvind Awasthi");
			keyboard.close();
			return;
			
		} else if (userInput.equals("no")) {
			System.out.println("Move the computer closer to the router and try to connect.");
			System.out.println(QUESTION);
			
			userInput = keyboard.nextLine();
			userInput = userInput.toLowerCase();
		} else {
			System.out.println("Invalid answer; try again.");
			System.out.println("Programmer: Arvind Awasthi");
			keyboard.close();
			return;
		}
			if (userInput.equals("yes")) {
				System.out.println("Done.");
				System.out.println("Programmer: Arvind Awasthi");
				keyboard.close();
				return;
			} else if (userInput.equals("no")){
				System.out.println("Contact your ISP.");
				System.out.println("Done.");
				System.out.println("Programmer: Arvind Awasthi");
				keyboard.close();
				return;
			} else {
				System.out.println("Invalid answer; try again.");
				System.out.println("Programmer: Arvind Awasthi");
				keyboard.close();
				return;
			}
		}
	}