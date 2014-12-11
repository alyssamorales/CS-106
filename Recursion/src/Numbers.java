
public class Numbers {

	public static void main(String[] args) {
		countUp(10);
		System.out.println();
		System.out.println("The sum of the numbers is: " + sumofNumbers(10));
	}
	public static void countUp (int num) {
		if (num > 1) { 
			//System.out.print(num + " ");
			countUp(num-1);
			
		}
		System.out.print(num + " ");
	}

	public static int sumofNumbers (int count){
		if (count >1) {
			return count + sumofNumbers(count -1);
		}
		return 1;
	}
}



