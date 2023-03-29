package Sales;

public class CardPayment extends Payment {

	private string nameOnCard;
	private int lastFourDigits;
	private string expiryDate;

	public string getNameOnCard() {
		return this.nameOnCard;
	}

	public int getLastFourDigits() {
		return this.lastFourDigits;
	}

	public string getExpiryDate() {
		return this.expiryDate;
	}

	/**
	 * 
	 * @param nameOnCard
	 */
	public void setNameOnCard(string nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	/**
	 * 
	 * @param lastFourDigits
	 */
	public void setLastFourDigits(int lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}

	/**
	 * 
	 * @param expiryDate
	 */
	public void setExpiryDate(string expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * 
	 * @param amount
	 */
	public bool makePayment(float amount) {
		// TODO - implement CardPayment.makePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param total
	 * @param date
	 */
	public CardPayment(float total, string date) {
		// TODO - implement CardPayment.CardPayment
		throw new UnsupportedOperationException();
	}

}