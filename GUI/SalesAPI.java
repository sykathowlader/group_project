package GUI;

import Customer.*;

public interface SalesAPI {

	/**
	 * 
	 * @param saleNO
	 * @param customer
	 */
	void createSell(int saleNO, Customer customer);

	/**
	 * 
	 * @param commPercentage
	 */
	void setCommPercentage(string commPercentage);

	/**
	 * 
	 * @param commAmount
	 */
	void setCommAmount(float commAmount);

	/**
	 * 
	 * @param amount
	 */
	void payLate(float amount);

	/**
	 * 
	 * @param ticketNO
	 */
	void makeRefund(int ticketNO);

}