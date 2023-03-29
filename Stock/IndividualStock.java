package Stock;

public class IndividualStock {

	private int advisorID;
	private int stockID;
	private int blaksSold;
	private int blanksAvailable;

	public int getAdvisorID() {
		return this.advisorID;
	}

	public int getBlaksSold() {
		return this.blaksSold;
	}

	public int getBlanksAvailable() {
		return this.blanksAvailable;
	}

	public int getStockID() {
		return this.stockID;
	}

	/**
	 * 
	 * @param advisorID
	 */
	public void setAdvisorID(int advisorID) {
		this.advisorID = advisorID;
	}

	/**
	 * 
	 * @param blaksSold
	 */
	public void setBlaksSold(int blaksSold) {
		this.blaksSold = blaksSold;
	}

	/**
	 * 
	 * @param blanksAvailable
	 */
	public void setBlanksAvailable(int blanksAvailable) {
		this.blanksAvailable = blanksAvailable;
	}

	public void sendIndividualStock() {
		// TODO - implement IndividualStock.sendIndividualStock
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param stockID
	 */
	public void setStockID(int stockID) {
		this.stockID = stockID;
	}

	public individualStock viewIndividualStock() {
		// TODO - implement IndividualStock.viewIndividualStock
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param stockID
	 */
	public IndividualStock(int stockID) {
		// TODO - implement IndividualStock.IndividualStock
		throw new UnsupportedOperationException();
	}

}