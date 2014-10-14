//For file operations
import java.io.*;
//For scanner
import java.util.*;

/**
 * 
 * Contains a program that uses input of a file to calculate ending balances of accounts.
 * Outputs the balances to an output file.
 * @see Building Java Programs (Chapter 6)
 * @author Alyssa Morales <amorales@skidmore.edu>
 *
 */

public class FileLookahead {

	/**
	 * This is the main method that handles the whole program.
	 * 
	 * @param args Arguments passed through the program
	 * @return void
	 */
	public static void main(String[] args) 
			//Throws an exception in case file doesn't exist
			throws FileNotFoundException {
		//To read input from the file
		Scanner input = new Scanner (new File("src/input.txt"));
		
		//Sets the opening balances of the accounts
		double obcheckings = 1540.39;
		double obsavings = 1000.00;
		double obcreditcard = 549.20;

		//Skips the first 3 lines of input on file (opening balances)
		String x = input.nextLine();
		x = input.nextLine();
		x = input.nextLine();
		
		//loops each line for the following if/else statements
		while(input.hasNextLine()) {
			x = input.nextLine();
			
			if (x.contains("Checking")) {
				if (x.contains("Withdrawal")) {
					//Open a scanner 
					Scanner i = new Scanner (x);
					//Sets Strings =  to "i.next();" and double =  to "i.nextDouble();" to represent the next token
					String date = i.next();
					String typeOfAccount = i.next();
					String typeOfTransaction = i.next();
					double amount = i.nextDouble();
					//Withdrawals must be negative
					obcheckings = obcheckings - amount;
					//Close scanner
					i.close();
				}
				else if (x.contains("Deposit")) {
					Scanner i = new Scanner (x);
					String date = i.next();
					String typeOfAccount = i.next();
					String typeOfTransaction = i.next();
					double amount = i.nextDouble();
					//Deposits must be positive
					obcheckings = obcheckings + amount;
					i.close();
				}
			}//Savings only Deposits (basically copy Checking's "else if")
			else if (x.contains("Savings")) {
				if (x.contains("Deposit")) {
					Scanner i = new Scanner (x);
					String date = i.next();
					String typeOfAccount = i.next();
					String typeOfTransaction = i.next();
					double amount = i.nextDouble();
					obsavings = obsavings + amount;
					i.close();
				}

			}//Credit Card only Withdrawals (basically copy Checking's "if")
			else if (x.contains("Credit Card")) {
				if (x.contains("Withdrawal")) {
					Scanner i = new Scanner (x);
					String date = i.next();
					String typeOfAccount = i.next();
					//add extra string because of the extra word "card"
					String extraword = i.next();
					String typeOfTransaction = i.next();
					double amount = i.nextDouble();
					obcreditcard = obcreditcard - amount;
					i.close();
				}
			}
		}//Prints out ending balances of accounts
		System.out.println("Checkings Ending Balance: " + obcheckings);
		System.out.println("Savings Ending Balance: " + obsavings);
		System.out.println("Credit Card Ending Balance: " + obcreditcard);
		
		//Closes file handler
		input.close();
		
		//Open to write out a file
		PrintStream output = new PrintStream ("output.txt");
		//Send out ending balances to file
		output.println(("Checkings Ending Balance: " + obcheckings));
		output.println(("Savings Ending Balance: " + obsavings));
		output.println(("Credit Card Ending Balance: " + obcreditcard));
		//close PrintStream object
		output.close();
	}

}

