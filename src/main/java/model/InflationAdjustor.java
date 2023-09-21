package model;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Sep 20, 2023
 */
public class InflationAdjustor {
	double gross;
	 double year;
     double ticketPrice;
     int ticketCount;
	
	InflationAdjustor(){
		super();
	}
	
	public InflationAdjustor(String userGross, String userYear) {
		super();
		this.gross = Double.parseDouble(userGross);
		this.year = Double.parseDouble(userYear);
		calculateTicketCount();
	}
	
	public void calculateTicketCount() {
	
	//this calculation was generated from a loose curve fit of movie ticket data 1940-2020 from imdb.com
	this.ticketPrice = 0.001378*this.year*this.year-5.34*this.year+5172.5;
	
	this.ticketCount = (int) Math.round(this.gross/this.ticketPrice);
	
}

	
	
/**
	 * @return the gross
	 */
	public double getGross() {
		return gross;
	}

	/**
	 * @param gross the gross to set
	 */
	public void setGross(double gross) {
		this.gross = gross;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return (int) this.year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(double year) {
		this.year = year;
	}

	/**
	 * @return the ticketPrice
	 */
	public String getTicketPrice() {
		return String.format("%.2f", ticketPrice);
	}

	/**
	 * @param ticketPrice the ticketPrice to set
	 */
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	/**
	 * @return the ticketCount
	 */
	public int getTicketCount() {
		return ticketCount;
	}

	/**
	 * @param ticketCount the ticketCount to set
	 */
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

@Override
public String toString() {
	return "This movie would have to sell " + ticketCount + " tickets in " + Math.round(this.year)
			+ " when tickets cost $" + String.format("%.2f", this.ticketPrice) + " to make that same amount"
			+ " at the Box Office.";
}
	
	
}//end class
