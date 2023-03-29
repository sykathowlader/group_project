package Sales;

public abstract interface SqlHelperAPI {

	/**
	 * 
	 * @param obj
	 * @param rw_mode
	 */
	abstract string generate(object obj, string rw_mode);

}