/**
 * 
 */

/**
 * @author amorales
 *
 */

import java.util.*; //for scanner

public class GPACalculatorScanners {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		//obtain values
		System.out.println("This program computes" + " a student's GPA.");
		System.out.println("Class 1 Credit Value: ");
		int credit1 =console.nextInt();
		System.out.println("Class 2 Credit Value: ");
		int credit2 = console.nextInt();
		System.out.println("Class 3 Credit Value: ");
		int credit3 = console.nextInt();
		System.out.println("Class 4 Credit Value: ");
		int credit4 = console.nextInt();
		System.out.println("Class 1 Grade Received: ");
		double grade1 = console.nextDouble();
		System.out.println("Class 2 Grade Received: ");
		double grade2 = console.nextDouble();
		System.out.println("Class 3 Grade Received: ");
		double grade3 = console.nextDouble();
		System.out.println("Class 4 Grade Received: ");
		double grade4 = console.nextDouble();
		
	
		// print results
		double GradePoint1 = credit1 * grade1;
		double GradePoint2 = credit2 * grade2;
		double GradePoint3 = credit3 * grade3;
		double GradePoint4 = credit4 * grade4;

		
		double GPA= TotalGPandCredit(GradePoint1 , GradePoint2 , GradePoint3 , GradePoint4 , credit1 , credit2 , credit3 , credit4);       
		
		System.out.println("GPA = " + GPA);
		
	} // end main
	
	public static double TotalGPandCredit(double GradePoint1 , double GradePoint2 , double GradePoint3 , double GradePoint4 , int Credit1 , int Credit2 , int Credit3 , int Credit4) {
		double TotalGP = GradePoint1 + GradePoint2 + GradePoint3 + GradePoint4;
		double TotalCredit = Credit1 + Credit2 + Credit3 + Credit4;
		// Divide total credits into total grade points to get GPA
		return TotalGP/TotalCredit;
	} // end method
	
	
} // end application
