//For file operations
import java.io.FileNotFoundException;

/**
 * 
 * Contains a program that uses input of the file "YankeesResults" to analyze questions about
 * the Yankees in the Regular Season of 2014.
 * 
 * @see Building Java Programs
 * @author Alyssa Morales <amorales@skidmore.edu>
 * 
 */

public class Main {

	/**
	 * This is the main method that handles the whole program.
	 * 
	 * @param args Arguments passed through the program
	 * @return void
	 */
	
	public static void main(String[] args) throws FileNotFoundException {

		//Used to pass through the Match class and the Methods class 
		Match [] b = Methods.init();
		
		//First question to analyze.
		System.out.println("What was the score on September 11th?");
		//Looks into the Methods class.
		//Looks into the method "ScoreOn" & inputs a date to return a score.
		System.out.println(Methods.ScoreOn("9/11/14", b));

		
		//Second question to analyze.
		System.out.println("How many times have the Yankees played Toronto?");
		//Looks into the Methods class.
		//Looks into the method "HowMany" & inputs a team to return the amount of games
		System.out.println(Methods.HowMany("Toronto", b));
	}}

