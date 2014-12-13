/**
 * 
 * This is a class that stores the data in an array of objects
 *
 */

public class Match {
	//Initializing  
	String currency1;
	String currency2;
	double exchangerate;
	
	/**
	 * The method sets parameters equal to each object
	 * @param initCurrency1
	 * @param initCurrency2
	 * @param initExchangerate
	 */

	public Match (String initCurrency1, String initCurrency2, double initExchangerate) {

		this.currency1 = initCurrency1;
		this.currency2 = initCurrency2;
		this.exchangerate = initExchangerate;
	}

	/**
	 * 
	 * @return returns currency1
	 */
	public String getCurrency1() {
		return this.currency1;
	}

	/**
	 * 
	 * @return returns currency2
	 */
	public String getCurrency2() {
		return this.currency2;
	}
	/**
	 * 
	 * @return returns exchangerate
	 */
	public double getExchangeRate() {
		return this.exchangerate;
	}

	/**
	 * 
	 * @param currency1 
	 * sets initCurrency1 to the initialized currency1
	 */
	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	/**
	 * 
	 * @param currency2
	 * sets initCurrency2 to the initialized currency2
	 */
	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	/**
	 * 
	 * @param exchangerate
	 * sets initExchangerate to the initialized exchangerate
	 */
	public void setExchangerate(double exchangerate) {
		this.exchangerate = exchangerate;
	}


}

