package Customer;

public class Customer {

	private string name;
	private string surname;
	private string type;
	private string email;
	private string address;
	private long mobile;
	private int numOfPurchase;

	public string getName() {
		return this.name;
	}

	public string getSurname() {
		return this.surname;
	}

	public string getType() {
		return this.type;
	}

	public string getEmail() {
		return this.email;
	}

	public string retrieveDetails() {
		// TODO - implement Customer.retrieveDetails
		throw new UnsupportedOperationException();
	}

	public string getAddress() {
		return this.address;
	}

	public long getMobile() {
		return this.mobile;
	}

	public int getNumOfPurchase() {
		return this.numOfPurchase;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name) {
		this.name = name;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(string surname) {
		this.surname = surname;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(string type) {
		this.type = type;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(string email) {
		this.email = email;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(string address) {
		this.address = address;
	}

	/**
	 * 
	 * @param mobile
	 */
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	/**
	 * 
	 * @param num
	 */
	public void setNumOfPurchase(int num) {
		this.numOfPurchase = num;
	}

	public void payLater() {
		// TODO - implement Customer.payLater
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param surname
	 */
	public Customer(string name, string surname) {
		// TODO - implement Customer.Customer
		throw new UnsupportedOperationException();
	}

}