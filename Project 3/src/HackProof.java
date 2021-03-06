/* For scanner.  */
 import java.util.*;
 
 
/**
 * 
 * Contains a program to hack-proof my Scandal questionnaire.
 * @see Building Java Programs (Chapter 5)
 * @author Alyssa Morales <amorales@skidmore.edu>
 *
 **/

public class HackProof {

	/**
	 * This is a method that gets the results after all of the user inputs.
	 *
	 * @param oliviapope
	 * @param abbywhelan
	 * @param huck
	 * @param harrisonwright
	 * 
	 * @return void
	 **/
	public static void getResults (int oliviapope, int abbywhelan, int huck, int harrisonwright){
		
		//The added (++) inputs determine which Scandal character is similar to the user.
		if (oliviapope> abbywhelan && oliviapope > huck && oliviapope> harrisonwright) {
			System.out.println("You are Olivia Pope!");
		}else if (abbywhelan> oliviapope && abbywhelan > huck && abbywhelan> harrisonwright) {
			System.out.println("You are Abby Whelan!");
		}else if (huck> oliviapope && huck> harrisonwright && huck> abbywhelan) {
			System.out.println("You are Huck!");
		}else {
			System.out.println("You are Harrison Wright!");
		}
	}
	
	
	/**
	 * This is the main method that handles the whole program.
	 * 
	 * @param args Arguments passed to the program. 
	 * @return void
	 **/
	public static void main(String[] args) {

		//Declare variables to keep track of criteria.
		int oliviapope = 0;
		int abbywhelan = 0;
		int huck = 0;
		int harrisonwright = 0;

		//Declare a scanner to get user input.
		Scanner console = new Scanner (System.in);

		
		System.out.print("Find out what Scandal character ");
		System.out.println("you are similar to!");
		System.out.println();

		
		//First question of the survey where user must find the answer they relate to the most.
		System.out.println("How do you react to criticism?");
		System.out.println("A. I could handle it well.");
		System.out.println("B. To me... it's the end of the world.");
		System.out.println("C. I stay quiet, but I know I'm right...");
		System.out.println("D. I try to convince the person that they're wrong.");
		System.out.println();

		//These do while loops helps hack-proof the program
		//It runs until condition (A, B, C, or D) is met
		String s;
		do {
			System.out.println("Enter A, B, C, or D");
			s = console.nextLine();
		} while (!s.equalsIgnoreCase("A")
			&& !s.equalsIgnoreCase("B")
			&& !s.equalsIgnoreCase("C")
			&& !s.equalsIgnoreCase("D"));
	
		//Made sure to include "IgnoreCase" because user can either input "A." or "a." & program will run.
		if(s.equalsIgnoreCase("A")) {
			oliviapope++;
		} else if (s.equalsIgnoreCase("B")) {
			abbywhelan++;
		} else if (s.equalsIgnoreCase("C")) {
			huck++;
		} else {
			harrisonwright++;
		}
		System.out.println();
		
		
		//Here is just repetition of the structure of the last question.
		System.out.println("How important is your career versus you relationships?");
		System.out.println("A. I am dedicated to my work, but I care about my family.");
		System.out.println("B. My career is the most important thing to me.");
		System.out.println("C. I would kill someone for my family/friends.");
		System.out.println("D. I do what I can for those who have done for me.");
		System.out.println();
		
		String s1;
		do {
			System.out.println("Enter A, B, C, or D");
			s1 = console.nextLine();
		} while (!s1.equalsIgnoreCase("A")
			&& !s1.equalsIgnoreCase("B")
			&& !s1.equalsIgnoreCase("C")
			&& !s1.equalsIgnoreCase("D"));

		if (s1.equalsIgnoreCase("A")) {
			oliviapope++;
		} else if (s1.equalsIgnoreCase("B")) {
			abbywhelan++;
		} else if (s1.equalsIgnoreCase("C")) {
			huck++;
		} else {
			harrisonwright++;
		}
		System.out.println();

		
		//Another repetition of the structures of the last 2 questions.
		System.out.println("How do you deal with pessimistic people?");
		System.out.println("A. I try to give the best advice I can.");
		System.out.println("B. I cannot deal with stupid people.");
		System.out.println("C. I hide in a corner.");
		System.out.println("D. I am a good listener.");
		System.out.println();

		String s2;
		do {
			System.out.println("Enter A, B, C, or D");
			s2 = console.nextLine();
		} while (!s2.equalsIgnoreCase("A")
			&& !s2.equalsIgnoreCase("B")
			&& !s2.equalsIgnoreCase("C")
			&& !s2.equalsIgnoreCase("D"));
		
		if (s2.equalsIgnoreCase("A")) {
			oliviapope++;
		} else if (s2.equalsIgnoreCase("B")) {
			abbywhelan++;
		} else if (s2.equalsIgnoreCase("C")) {
			huck++;
		} else {
			harrisonwright++;
		}
		System.out.println();
		
		
		//Another repetition of the structures of the last 3 questions
		System.out.println("What are you talented in?");
		System.out.println("A. I fix other people's problems.");
		System.out.println("B. I am a natural fighter.");
		System.out.println("C. I am good with electronics.");
		System.out.println("D. I have great memory.");
		System.out.println();

		String s3;
		do {
			System.out.println("Enter A, B, C, or D");
			s3 = console.nextLine();
		} while (!s3.equalsIgnoreCase("A")
			&& !s3.equalsIgnoreCase("B")
			&& !s3.equalsIgnoreCase("C")
			&& !s3.equalsIgnoreCase("D"));
		
		if (s3.equalsIgnoreCase("A")) {
			oliviapope++;
		} else if (s3.equalsIgnoreCase("B")) {
			abbywhelan++;
		} else if (s3.equalsIgnoreCase("C")) {
			huck++;
		} else {
			harrisonwright++;
		}
		System.out.println();
		
		
		//The last repetition of the structures of the last 4 questions.
		System.out.println("What would others say about your past?");
		System.out.println("A. It's all a secret.");	
		System.out.println("B. He/ she has issues.");
		System.out.println("C. A very dark past.");
		System.out.println("D. How is he/ she still alive?");
		System.out.println();

		String s4;
		do {
			System.out.println("Enter A, B, C, or D");
			s4 = console.nextLine();
		} while (!s4.equalsIgnoreCase("A")
			&& !s4.equalsIgnoreCase("B")
			&& !s4.equalsIgnoreCase("C")
			&& !s4.equalsIgnoreCase("D"));
		
		if (s4.equalsIgnoreCase("A")) {
			oliviapope++;
		} else if (s4.equalsIgnoreCase("B")) {
			abbywhelan++;
		} else if (s4.equalsIgnoreCase("C")) {
			huck++;
		} else {
			harrisonwright++;
		}
		System.out.println();
		
		//Added space to be organized.
		System.out.println();
		
		
	//Self explanatory... This gets the results.
	getResults( oliviapope,  abbywhelan,  huck,  harrisonwright);
		

	}

}
