package Sales;

import Customer.*;

public class Alert {

	private Customer customer;
	private float paymentDue;
	private string dateDue;

	public Customer getCustomer() {
		return this.customer;
	}

	public float getPaymentDue() {
		return this.paymentDue;
	}

	public string getDateDue() {
		return this.dateDue;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * 
	 * @param paymentDue
	 */
	public void setPaymentDue(float paymentDue) {
		this.paymentDue = paymentDue;
	}

	/**
	 * 
	 * @param dateDue
	 */
	public void setDateDue(string dateDue) {
		this.dateDue = dateDue;
	}

	/**
	 * 
	 * @param managerID
	 */
	public void alertManager(int managerID) {
		// TODO - implement Alert.alertManager
		throw new UnsupportedOperationException();
	}

	public Alert() {
		// TODO - implement Alert.Alert
		throw new UnsupportedOperationException();
	}

}