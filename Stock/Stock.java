package Stock;

public class Stock {

	private int stockID;
	private int blanksAvaiable;
	private int blanksSold;

	public int getStockID() {
		return this.stockID;
	}

	public int getBlanksAvaiable() {
		return this.blanksAvaiable;
	}

	public int getBlanksSold() {
		return this.blanksSold;
	}

	/**
	 * 
	 * @param stockID
	 */
	public void setStockID(int stockID) {
		this.stockID = stockID;
	}

	/**
	 * 
	 * @param blanksAvaiable
	 */
	public void setBlanksAvaiable(int blanksAvaiable) {
		this.blanksAvaiable = blanksAvaiable;
	}

	/**
	 * 
	 * @param blanksSold
	 */
	public void setBlanksSold(int blanksSold) {
		this.blanksSold = blanksSold;
	}

	/**
	 * 
	 * @param blankNO
	 */
	public Blank[] addBlank(int[] blankNO) {
		// TODO - implement Stock.addBlank
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param stockID
	 */
	public Stock(int stockID) {
		// TODO - implement Stock.Stock
		throw new UnsupportedOperationException();
	}

}