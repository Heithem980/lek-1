/**
 * 
 */
package lek1;

import java.util.Scanner;

/**
 * @author heithemghasali
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String passcode = "Heaven";
		int tries = 0;
		
		do {
			tries++;
			System.out.print("Ange lösenord: ");
		    String userInput = input.nextLine();
		
		    if(userInput.equals(passcode)) {
		    	System.out.println("Password is correct!");
		    	break;
		    }else {
		    	System.out.println("Incorrect password!  try again ...");
		    }
		    
		}while(tries<3);
		
		
		
		

	}

}
