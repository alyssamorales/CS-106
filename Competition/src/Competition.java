import java.io.*;
import java.util.Scanner;

public class Competition {

	public static void main(String[] args) throws FileNotFoundException {
		{
			System.out.println("PROBLEM 1");
			System.out.println("NFC West 	W   L  T");
			System.out.println("-------------------------");
			System.out.println("Seattle 	13  3  0");
			System.out.println("San Francisco 	12  4  0");
			System.out.println("Arizona 	10  6  0");
			System.out.println("St. Louis 	7   9  0");
			System.out.println();
			System.out.println("NFC North 	W   L  T");
			System.out.println("-------------------------");
			System.out.println("Green Bay 	8   7  1");
			System.out.println("Chicago 	8   8  0");
			System.out.println("Detroit 	7   9  0");
			System.out.println("Minnesota 	5  10  1");
			System.out.println();
		}
		{
			System.out.println("PROBLEM 2");
			System.out.println();
			System.out.println("\\    /\\");
			System.out.println(" )"+ "  (" + " ')");
			System.out.println("(  /  )");
			System.out.println(" \\(__)|");
			System.out.println();
		}
		{
			System.out.println("PROBLEM 3");
			System.out.println("|\\_/|");
			System.out.println("|q p|   /}");
			System.out.println("( " + "0" + " )\"\"\""+ "\\");
			System.out.println("|\"" + "^" + "\"`" + "    |");
			System.out.println("||_/=" + "\\" + "\\" + "__|");
			System.out.println();
		}
		{
			System.out.println("PROBLEM 4");
			Scanner input = new Scanner(new File("Problem 4 input"));
			String x;
			while (input.hasNext()){
				x = input.nextLine();
				System.out.println(x);
				if (x.contains("Nemo")) {
					System.out.println("Found");
				}else {
					System.out.println("Missing");
				}
			}
		}
	}

}
