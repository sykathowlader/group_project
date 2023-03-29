package Sales;

public class Commission {

	private string commPercentage;
	private float commAmount;

	public string getCommPercentage() {
		return this.commPercentage;
	}

	/**
	 * 
	 * @param commPercentage
	 */
	public void setCommPercentage(string commPercentage) {
		this.commPercentage = commPercentage;
	}

	public float getCommAmount() {
		return this.commAmount;
	}

	/**
	 * 
	 * @param commAmount
	 */
	public void setCommAmount(float commAmount) {
		this.commAmount = commAmount;
	}

	/**
	 * 
	 * @param commPercentage
	 */
	public Commission(string commPercentage) {
		// TODO - implement Commission.Commission
		throw new UnsupportedOperationException();
	}

}