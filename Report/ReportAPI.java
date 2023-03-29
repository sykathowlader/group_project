package Report;

public abstract interface ReportAPI {

	/**
	 * 
	 * @param type
	 * @param period
	 */
	abstract Report generateReport(string type, string period);

	/**
	 * 
	 * @param type
	 * @param time
	 */
	abstract Report generateAutomaticReport(string type, string time);

	/**
	 * 
	 * @param reportNumber
	 */
	abstract Report viewReport(int reportNumber);

	/**
	 * 
	 * @param type
	 * @param advisorName
	 * @param period
	 */
	abstract void IndividualReport(string type, string advisorName, string period);

}