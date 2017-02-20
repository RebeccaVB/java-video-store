import java.math.BigDecimal;

public class Rental {

	Movie rented;
	int days;

	public Rental(Movie rented, int days) {
		this.rented = rented;
		this.days = days;
	}

	public String getTitle() {
		return rented.getTitle();
	}

	public String getPriceCode() {
		return rented.priceCode;
	}
	public BigDecimal calculateFees() {
		return rentalfeeCal();
	}

	private BigDecimal rentalfeeCal() {
		BigDecimal fee = rented.calculateFees(days);
		return fee;
	}
}
