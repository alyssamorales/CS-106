//For scanner
import java.util.*;
//For file operations
import java.io.FileNotFoundException;

/**
 * This Final Project is a currency converter that uses exchange rates
 * from a file to convert money.
 * 
 * @author Alyssa Morales <amorales.skidmore.edu>
 *
 */
public class CurrencyConverter {
	/**
	 * This is the main program that overall handles the whole project.
	 * 
	 * @param args (arguments passed throw the program
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) 
	// In case the file is not found
			throws FileNotFoundException {

		//Used to pass through the Match and Methods classes
		Match [] a = Methods.init();
		Scanner console = new Scanner (System.in); //for user input

		//helps loop around the program if quit = false
		boolean quit = false;
		String string1 = "Continue";
		String string2 = "Quit";
		while (quit == false) {
			System.out.println("Want to convert a currency? Here's a Currency Converter!");
			System.out.println();

			System.out.println("How much do you want to convert? Enter amount.");
			System.out.println();
			double s1; //Initializes first input as a double
			do {
				//so user can input a number
				s1 = console.nextDouble();
			} while (s1<0); //hack proof code so that user cannot put a negative number

			System.out.println("What currency do you want to convert from?");
			System.out.println("Please choose from USD, EUR, GBP, INR, AUD, CAD, ZAR, NZD, & JPN.");
			System.out.println();
			String s2; //Initializes the first input as a string
			do {
				//so the user can input currency 
				s2 = console.nextLine();
			} while 
				//Hack proof so that user can't put any other currencies besides the ones in the file
				(!s2.equalsIgnoreCase("USD")
						&& !s2.equalsIgnoreCase("EUR")
						&& !s2.equalsIgnoreCase("GBP")
						&& !s2.equalsIgnoreCase("INR")
						&& !s2.equalsIgnoreCase("AUD")
						&& !s2.equalsIgnoreCase("CAD")
						&& !s2.equalsIgnoreCase("ZAR")
						&& !s2.equalsIgnoreCase("NZD")
						&& !s2.equalsIgnoreCase("JPN"));


			System.out.println("What currency do you want to convert to?");
			System.out.println("Please choose from USD, EUR, GBP, INR, AUD, CAD, ZAR, NZD, & JPN.");
			System.out.println();
			String s3; //Initializes the third input as a string
			do {
				//so the user can inout second currency
				s3 = console.nextLine();
			} while (s3.equalsIgnoreCase(s2) //to make sure user does not input the currency twice 
					||( !s3.equalsIgnoreCase("USD")
							&& !s3.equalsIgnoreCase("EUR")
							&& !s3.equalsIgnoreCase("GBP")
							&& !s3.equalsIgnoreCase("INR")
							&& !s3.equalsIgnoreCase("AUD")
							&& !s3.equalsIgnoreCase("CAD")
							&& !s3.equalsIgnoreCase("ZAR")
							&& !s3.equalsIgnoreCase("NZD")
							&& !s3.equalsIgnoreCase("JPN")));
			//Multiples inputed number by the return in the Methods class of the method Connection1
			//the return of the method Connection1 
			System.out.println(s1 * Methods.connection1(s2, s3, a));


			System.out.println("Would you like to quit or continue converting? Enter Quit or Continue.");
			String s4;
			do {
				s4 = console.nextLine();
			} while (!s4.equalsIgnoreCase("Quit")
					&& !s4.equalsIgnoreCase("Continue"));

			//If input is continue, loop around program (quit =false)
			if (s4.equals(string1)){
				quit = false;

				//If input is quit, quit program (quit = true)
			}else if (s4.equals(string2)){
				System.out.println("You chose to quit. Thank you for converting!");
				quit = true;

			}
		}
		console.close();

	}
}
