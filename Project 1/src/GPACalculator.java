/**
 * 
 */

/**
 * @author amorales
 *
 */
public class GPACalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Worth of each credit
		int Credit1 = 4;
		int Credit2 = 3;
		int Credit3 = 4;
		int Credit4 = 4;
		
		// Grade received in each class
		double Grade1 = 4.00;
		double Grade2 = 3.70;
		double Grade3 = 3.00;
		double Grade4 = 4.00;
		
		// Grade Point is determined by Multiplying Credit and Grade
		double GradePoint1 = Credit1 * Grade1;
		double GradePoint2 = Credit2 * Grade2;
		double GradePoint3 = Credit3 * Grade3;
		double GradePoint4 = Credit4 * Grade4;
		
		TotalGPandCredit(GradePoint1 , GradePoint2 , GradePoint3 , GradePoint4 , Credit1 , Credit2 , Credit3 , Credit4);       
	} // end main
	
	public static void TotalGPandCredit(double GradePoint1 , double GradePoint2 , double GradePoint3 , double GradePoint4 , int Credit1 , int Credit2 , int Credit3 , int Credit4) {
		double TotalGP = GradePoint1 + GradePoint2 + GradePoint3 + GradePoint4;
		double TotalCredit = Credit1 + Credit2 + Credit3 + Credit4;
		// Divide total credits into total grade points to get GPA
		System.out.println("GPA = " + TotalGP / TotalCredit);
	} // end method
} // end application
