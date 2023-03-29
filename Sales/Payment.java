package Sales;

public class Payment {

	private int PaymentID;
	private string PaymentType;
	private string paymentCurrency;
	private float TotalToPay;
	private string paymentDate;

	public void getPaymentID() {
		// TODO - implement Payment.getPaymentID
		throw new UnsupportedOperationException();
	}

	public string getPaymentType() {
		// TODO - implement Payment.getPaymentType
		throw new UnsupportedOperationException();
	}

	public string getPaymentCurrency() {
		return this.paymentCurrency;
	}

	public float getTotalToPay() {
		// TODO - implement Payment.getTotalToPay
		throw new UnsupportedOperationException();
	}

	public string getPaymentDate() {
		return this.paymentDate;
	}

	/**
	 * 
	 * @param PaymentID
	 */
	public void setPaymentID(int PaymentID) {
		// TODO - implement Payment.setPaymentID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param PaymentType
	 */
	public void setPaymentType(string PaymentType) {
		// TODO - implement Payment.setPaymentType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param paymentCurrency
	 */
	public void setPaymentCurrency(string paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	/**
	 * 
	 * @param TotalToPay
	 */
	public void setTotalToPay(float TotalToPay) {
		// TODO - implement Payment.setTotalToPay
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param paymentDate
	 */
	public void setPaymentDate(string paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * 
	 * @param amount
	 */
	public void payLater(float amount) {
		// TODO - implement Payment.payLater
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param total
	 * @param date
	 */
	public Payment(float total, string date) {
		// TODO - implement Payment.Payment
		throw new UnsupportedOperationException();
	}

}