package Sales;

public class Refund {

	private int ticketNO;
	private string refundDate;
	private float refundAmount;
	private string refundCurrency;

	public int getTicketNO() {
		return this.ticketNO;
	}

	/**
	 * 
	 * @param ticketNO
	 */
	public void setTicketNO(int ticketNO) {
		this.ticketNO = ticketNO;
	}

	public string getRefundDate() {
		return this.refundDate;
	}

	/**
	 * 
	 * @param refundDate
	 */
	public void setRefundDate(string refundDate) {
		this.refundDate = refundDate;
	}

	public float getRefundAmount() {
		return this.refundAmount;
	}

	/**
	 * 
	 * @param refundAmount
	 */
	public void setRefundAmount(float refundAmount) {
		this.refundAmount = refundAmount;
	}

	public string getRefundCurrency() {
		return this.refundCurrency;
	}

	/**
	 * 
	 * @param refundCurrency
	 */
	public void setRefundCurrency(string refundCurrency) {
		this.refundCurrency = refundCurrency;
	}

	/**
	 * 
	 * @param ticketNO
	 */
	public Refund(int ticketNO) {
		// TODO - implement Refund.Refund
		throw new UnsupportedOperationException();
	}

}