//For file operations
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * This is a class with 3 methods that interact with the Main method 
 * 
 */


public class Methods {

	public static Match[] init() throws FileNotFoundException{
		
		int numLines = 0;
		//Reads input file
		Scanner input = new Scanner(new File("src/YankeesResults"));

		//This loop goes through each line and counts how many lines are in the file
		while (input.hasNextLine()) {
			input.nextLine();
			numLines++;
		} { 	
			System.out.println("Number of Lines: " + numLines);
		}
		//You want to close it in order to start from 0 again for the next loop
		input.close();

		//"You have to have a paper to write on it." numLines:"The size of the paper you want"
		Match [] data = new Match [numLines];
		int i = 0;

		input = new Scanner (new File("src/YankeesResults"));
		//This while loop insures that the program names each section correctly
		while (input.hasNext()){

			String initDate = input.next();


			String initVersus = input.next();
			//An if/else statement is needed because some input on the Versus have more than one word
			if (initVersus.equals("Tampa") || (initVersus.equals("Kansas"))) {
				initVersus = initVersus+ " " + input.next();
			}else if (initVersus.equals("Chi.")) {
				//initVersus= Chi. + " " + White " " + Socks
				initVersus = initVersus  + " " + input.next() + " " + input.next();
			}


			String initScore = input.next();
			//An if/else statement is needed because the actual scores comes after a letter
			if (initScore.equals("W") || (initScore.equals("L"))){
				initScore = initScore + " " + input.next();
			}


			String initType = input.next();
			//An if/else statement is needed because the type has 2 words to it
			if (initType.equals("Regular")) {
				initType = initType + " " + input.next();
			}

			Match temp= new Match (initDate, initVersus, initScore, initType);
			data [i] = temp;
			i++;
		}
		return data;
	}
	
	//This method increments i in order to go through the sections "Date" & "Score" 
	public static String ScoreOn (String Date, Match []a){
		for(int i=0; i <a.length; i++){
			if (a[i].getDate().equals(Date)){
				return "On " + Date + " the score was " + a[i].getScore() + ".";

			}	
		}
		//
		return ("Score was not found.");
	}
	//This method increments i in order to go through the section "Versus"
	//It also tallies up the number of times a team is shown
	public static String HowMany (String Versus, Match []a){
		int tally = 0;
		for(int i=0; i <a.length; i++){
			if (a[i].getVersus().equals(Versus)){
				tally ++;
			}	
		}
		return "The Yankees have played against " + Versus + " " + tally + " times.";
	}
}

