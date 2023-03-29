package Report;

public class IndividualReport extends Report {

	private string advisorName;
	private int advisorCode;
	private float fareAmount;
	private float tax;
	private string reportCurrency;
	private float exchangeRate;
	private string paymentType;
	private float commission;

	public string getAdvisorName() {
		return this.advisorName;
	}

	public int getAdvisorCode() {
		return this.advisorCode;
	}

	public float getFareAmount() {
		return this.fareAmount;
	}

	public float getTax() {
		return this.tax;
	}

	public string getReportCurrency() {
		return this.reportCurrency;
	}

	public float getExchangeRate() {
		return this.exchangeRate;
	}

	public string getPaymentType() {
		return this.paymentType;
	}

	public float getCommission() {
		return this.commission;
	}

	/**
	 * 
	 * @param name
	 */
	public void setAdvisorName(string name) {
		this.advisorName = name;
	}

	/**
	 * 
	 * @param code
	 */
	public void setAdvisorCode(int code) {
		this.advisorCode = code;
	}

	/**
	 * 
	 * @param amount
	 */
	public void setFareAmount(float amount) {
		this.fareAmount = amount;
	}

	/**
	 * 
	 * @param Tax
	 */
	public void setTax(float Tax) {
		this.tax = Tax;
	}

	/**
	 * 
	 * @param currency
	 */
	public void setReportCurrency(string currency) {
		this.reportCurrency = currency;
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
	 * @param paymentType
	 */
	public void setPaymentType(string paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * 
	 * @param commission
	 */
	public void setCommission(float commission) {
		this.commission = commission;
	}

	/**
	 * 
	 * @param type
	 * @param advisorName
	 * @param period
	 */
	public IndividualReport(string type, string advisorName, string period) {
		// TODO - implement IndividualReport.IndividualReport
		throw new UnsupportedOperationException();
	}

}