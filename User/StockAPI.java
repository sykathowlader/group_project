package User;

import Stock.*;

public abstract interface StockAPI {

	/**
	 * 
	 * @param type
	 */
	abstract Blank[] findBlank(string type);

	/**
	 * 
	 * @param blankNO
	 */
	abstract void sellBlank(int blankNO);

	/**
	 * 
	 * @param blankNO
	 */
	abstract Blank viewBlankDetails(int blankNO);

	/**
	 * 
	 * @param stockID
	 */
	abstract IndividualStock viewIndividualStock(int stockID);

	/**
	 * 
	 * @param stockID
	 */
	abstract Stock viewStock(int stockID);

	/**
	 * 
	 * @param blankNO
	 * @param advisoID
	 */
	abstract void assignBlank(int blankNO, int advisoID);

	/**
	 * 
	 * @param blankNO
	 * @param advisorID
	 */
	abstract void reassignBlank(int blankNO, int advisorID);

	/**
	 * 
	 * @param blankNO
	 */
	abstract Blank[] addBlank(int[] blankNO);

	/**
	 * 
	 * @param blankNO
	 */
	abstract bool returnBlank(int blankNO);

	/**
	 * 
	 * @param couponNO
	 */
	void addCoupons(int[] couponNO);

}