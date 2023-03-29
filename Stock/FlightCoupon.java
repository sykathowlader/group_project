package Stock;

public class FlightCoupon {

	private int couponNO;
	private string departureAirport;
	private string arivalAirport;
	private string duration;
	private string flightNO;
	private string seatNumber;
	private bool isAuditorCoupon;

	public int getCouponNO() {
		return this.couponNO;
	}

	public string getDepartureAirport() {
		return this.departureAirport;
	}

	public string getArivalAirport() {
		return this.arivalAirport;
	}

	public string getDuration() {
		return this.duration;
	}

	public string getFlightNO() {
		return this.flightNO;
	}

	public string getSeatNumber() {
		return this.seatNumber;
	}

	/**
	 * 
	 * @param CouponNO
	 */
	public void setCouponNO(int CouponNO) {
		this.couponNO = CouponNO;
	}

	/**
	 * 
	 * @param departureAirport
	 */
	public void setDepartureAirport(string departureAirport) {
		this.departureAirport = departureAirport;
	}

	/**
	 * 
	 * @param arivalAirport
	 */
	public void setArivalAirport(string arivalAirport) {
		this.arivalAirport = arivalAirport;
	}

	/**
	 * 
	 * @param duration
	 */
	public void setDuration(string duration) {
		this.duration = duration;
	}

	/**
	 * 
	 * @param flightNO
	 */
	public void setFlightNO(string flightNO) {
		this.flightNO = flightNO;
	}

	public bool getIsAuditorCoupon() {
		return this.isAuditorCoupon;
	}

	/**
	 * 
	 * @param seatNumber
	 */
	public void setSeatNumber(string seatNumber) {
		this.seatNumber = seatNumber;
	}

	/**
	 * 
	 * @param isAuditorCoupon
	 */
	public void setIsAuditorCoupon(bool isAuditorCoupon) {
		this.isAuditorCoupon = isAuditorCoupon;
	}

	/**
	 * 
	 * @param couponNO
	 */
	public void addCoupons(int[] couponNO) {
		// TODO - implement FlightCoupon.addCoupons
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param couponNO
	 * @param departure
	 * @param arrival
	 */
	public FlightCoupon(int couponNO, string departure, string arrival) {
		// TODO - implement FlightCoupon.FlightCoupon
		throw new UnsupportedOperationException();
	}

}