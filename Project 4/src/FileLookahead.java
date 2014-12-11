//For file operations
import java.io.*;
//For scanner
import java.util.*;

/**
 * 
 * Contains a program that uses input of a file to calculate ending balances of
 * accounts. Outputs the balances to an output file.
 * 
 * @see Building Java Programs (Chapter 6)
 * @author Alyssa Morales <amorales@skidmore.edu>
 * 
 */

public class FileLookahead {

	/**
	 * This is the main method that handles the whole program.
	 * 
	 * @param args
	 *            Arguments passed through the program
	 * @return void
	 */
	public static void main(String[] args)
	// Throws an exception in case file doesn't exist
			throws FileNotFoundException {

		int numLines = 0;

		// To read input from the file
		Scanner input = new Scanner(new File("src/input.txt"));

		// Sets the opening balances of the accounts
		//double checkings = 1540.39;
		//double savings = 1000.00;
		//double credit = 549.20;

		while (input.hasNextLine()) {
			input.nextLine();
			numLines++;
		} { 
			System.out.println("Number of Lines: " + numLines);
		}
		input.close();

		String [] dates = new String [numLines];
		String[] accounts = new String [numLines];
		String[] transactions = new String [numLines];
		double [] amounts = new double [numLines];

		int i = 0;
		input = new Scanner (new File("src/input.txt"));
		while (input.hasNext()) {


			dates [i] = input.next();
		
			//System.out.println(dates[i]);

			accounts [i] = input.next();
			if (accounts [i].equals("Credit")) {
				accounts [i] = accounts[i] + " " + input.next();
			}

			//System.out.println(accounts[i]);

			transactions[i] = input.next();
			if (transactions[i].equals("Opening")) {
				transactions[i] = transactions[i] + " " + input.next();
			}

			//System.out.println(transactions[i]);

			amounts[i] = input.nextDouble();

			//System.out.println(amounts[i]);

			i++;
		}
		input.close();

		//calculate totals
		double checkings1 = 0.0;
		double savings1 = 0.00;
		double credit1 = 0.0; {

			for (i =0; i < dates.length; i++) {

				if (accounts[i].equals("Checking")) {
					if (transactions[i].equals("Withdrawal")) {
						checkings1 -= amounts[i];
					} else {
						checkings1 += amounts[i];
					}
				} else if (accounts[i].equals("Savings")) {
					if (transactions[i].equals("Withdrawal")) {
						savings1 -= amounts[i];
					} else {
						savings1 += amounts[i];
					}
				} else{
					if (transactions[i].equals("Withdrawal")) {
						credit1 -= amounts[i];
					} else {
						credit1 += amounts[i];
					}
				}
			}

			// Prints out ending balances of accounts
			System.out.println("Checkings Ending Balance: " + checkings1);
			System.out.println("Savings Ending Balance: " + savings1);
			System.out.println("Credit Card Ending Balance: " + credit1);



			// Closes file handler
			input.close();

			// Open to write out a file
			PrintStream output = new PrintStream("output.txt");
			// Send out ending balances to file
			output.println(("Checkings Ending Balance: " + checkings1));
			output.println(("Savings Ending Balance: " + savings1));
			output.println(("Credit Card Ending Balance: " + credit1));
			// close PrintStream object
			output.close();
		}

	}
}


