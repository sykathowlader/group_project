package Sales;

public class ExhangeRate {

	private string currencyPair;
	private float exchangeRate;
	private string exchangeDate;

	public string getCurrencyPair() {
		return this.currencyPair;
	}

	public float getExchangeRate() {
		return this.exchangeRate;
	}

	public string getExchangeDate() {
		return this.exchangeDate;
	}

	/**
	 * 
	 * @param currencyPair
	 */
	public void setCurrencyPair(string currencyPair) {
		this.currencyPair = currencyPair;
	}

	/**
	 * 
	 * @param exchangeRate
	 */
	public void setExchangeRate(float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * 
	 * @param exchangeDate
	 */
	public void setExchangeDate(string exchangeDate) {
		this.exchangeDate = exchangeDate;
	}

	/**
	 * 
	 * @param currencyPair
	 */
	public float getCurrencyRate(string currencyPair) {
		// TODO - implement ExhangeRate.getCurrencyRate
		throw new UnsupportedOperationException();
	}

	public ExhangeRate() {
		// TODO - implement ExhangeRate.ExhangeRate
		throw new UnsupportedOperationException();
	}

}