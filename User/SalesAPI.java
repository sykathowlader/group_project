package User;

import Customer.*;

public abstract interface SalesAPI {

	/**
	 * 
	 * @param saleNO
	 * @param customer
	 */
	abstract void createSell(int saleNO, Customer customer);

	/**
	 * 
	 * @param commPercentage
	 */
	abstract void setCommPercentage(string commPercentage);

	/**
	 * 
	 * @param commAmount
	 */
	abstract void setCommAmount(float commAmount);

	/**
	 * 
	 * @param amount
	 */
	abstract void payLate(float amount);

	/**
	 * 
	 * @param ticketNO
	 */
	abstract void makeRefund(int ticketNO);

}