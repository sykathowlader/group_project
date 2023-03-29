package GUI;

import Customer.*;

public abstract interface CustomerAPI {

	/**
	 * 
	 * @param name
	 * @param surname
	 */
	abstract Customer searchCustomer(string name, string surname);

	/**
	 * 
	 * @param name
	 * @param surname
	 */
	abstract Customer addCustomer(string name, string surname);

	/**
	 * 
	 * @param name
	 * @param surname
	 */
	abstract bool removeCustomer(string name, string surname);

	abstract string getDiscountType();

	/**
	 * 
	 * @param type
	 */
	abstract void setDiscountType(string type);

}