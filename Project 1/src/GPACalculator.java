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
        int Credit1 = 4;
        int Credit2 = 3;
        int Credit3 = 4;
        int Credit4 = 4;
        double Grade1 = 4.00;
        double Grade2 = 3.70;
        double Grade3 = 3.00;
        double Grade4 = 4.00;
        double GradePoint1 = Credit1 * Grade1;
        double GradePoint2 = Credit2 * Grade2;
        double GradePoint3 = Credit3 * Grade3;
        double GradePoint4 = Credit4 * Grade4;
        
        TotalGPandCredit();
        
        System.out.println("GPA = " TotalGP / TotalCredit);
        		
	}
	public static void TotalGPandCredit () {
	 System.out.println("TotalGP = " + GradePoint1 + GradePoint2 + GradePoint3 + GradePoint4);
     System.out.println("TotalCredit = " + Credit1 + Credit2 + Credit3 + Credit4);
     }
