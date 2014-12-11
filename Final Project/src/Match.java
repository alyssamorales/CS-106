/**
 * 
 * This is a class that stores the data in an array of objects
 *
 */

public class Match {
	String currency1;
	String currency2;
	double exchangerate;

	public Match (String initCurrency1, String initCurrency2, double initExchangerate) {

		//The parameters are set equal to each object
		this.currency1 = initCurrency1;
		this.currency2 = initCurrency2;
		this.exchangerate = initExchangerate;
	}

	//Returns each object
	public String getCurrency1() {
		return this.currency1;
	}

	public String getCurrency2() {
		return this.currency2;
	}

	public double getExchangeRate() {
		return this.exchangerate;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	public void setExchangerate(double exchangerate) {
		this.exchangerate = exchangerate;
	}


}

