//This is to locate the file
import java.io.File;
//throws exception if the file is not found
import java.io.FileNotFoundException;
//For scanner
import java.util.Scanner;

/**
 * This class has two methods that interact with the main method
 *
 */

public class Methods {

	/**
	 * This method goes through the file and puts it into arrays
	 * 
	 * @return returns data
	 * @throws FileNotFoundException just in case file is nonexistent or can't be found
	 */
	public static Match[] init () throws FileNotFoundException{

		int numLine = 0;
		//reads the input file ExchangeRate.txt
		Scanner input1 = new Scanner (new File ("src/ExchangeRate.txt"));

		//This loop goes through each line
		while (input1.hasNextLine()) {
			input1.nextLine();
			numLine++;
		}

		//Close it in order to start from 0 again for the next loop
		input1.close();


		Match [] data = new Match [numLine];
		int i = 0;
		Scanner input = new Scanner (new File("src/ExchangeRate.txt"));

		//This while loop insures that the program names each section correctly. 
		while (input.hasNext()) {
			String curr1 = input.next(); //Set curr1 to the first section on the certain line
			String curr2 = input.next(); //Set curr2 to the second section on that same line
			double ex = input.nextDouble(); //Set ex to the third section on the same line
			//Sets currency2, currency2, and the exchange rate into an array
			data[i] = new Match(curr1, curr2, ex);
			i++;
		}
		input.close();
		return data;

	}

	/**
	 * This method gets currency1 and currency2 in order to get exchangerate
	 * @param currency1
	 * @param currency2
	 * @param a
	 * @return returns exchangerate
	 */
	public static double connection1 (String currency1, String currency2, Match []a){
		double exchangeRate = 0.0;
		for(int i=0; i <a.length; i++){
			//If you have both currencies...
			if (a[i].getCurrency1().equalsIgnoreCase(currency1) && a[i].getCurrency2().equalsIgnoreCase(currency2)){
				//get the exchange rate
				exchangeRate = a[i].getExchangeRate();	
			}
		}
		return exchangeRate;

	}
}




