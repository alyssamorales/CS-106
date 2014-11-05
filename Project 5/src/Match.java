/**
 * This is a class stores the data in an array of objects
 * 
 */

public class Match {
	String date;
	String versus;
	String score;
	String type;
	public Match (String initDate, String initVersus, String initScore, String initType) {

		//The parameters are set equal to each object
		this.date = initDate;
		this.versus = initVersus;
		this.score = initScore;
		this.type = initType;
	}

	//Returns each object
	public String getDate() {
		return this.date;
	}

	public String getVersus() {
		return this.versus;
	}

	public String getScore() {
		return this.score;
	}

	public String getType() {
		return this.type;
	}
}
