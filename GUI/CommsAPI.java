package GUI;

public abstract interface CommsAPI {

	/**
	 * 
	 * @param amount
	 */
	abstract bool makePayment(float amount);

	/**
	 * 
	 * @param amount
	 */
	abstract bool makeRefund(float amount);

	/**
	 * 
	 * @param time
	 */
	abstract bool triggerAlert(string time);

	/**
	 * 
	 * @param reportNumber
	 */
	abstract bool sendReport(string reportNumber);

	abstract Blank[] getBlanks();

	/**
	 * 
	 * @param blanks
	 */
	abstract bool returnBlank(Blank[] blanks);

	/**
	 * 
	 * @param currencyPair
	 */
	abstract float getCurrencyRate(string currencyPair);

	/**
	 * 
	 * @param date
	 * @param currencyPair
	 */
	abstract float getPastCurencyRate(string date, string currencyPair);

}