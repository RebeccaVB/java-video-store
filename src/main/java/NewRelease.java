import java.math.BigDecimal;

public class NewRelease extends Movie {
	public NewRelease(String title) {

		super(title, "New Release");
	}
	@Override
	public String getPriceCode() {
		return this.priceCode;
	}

	public BigDecimal calculateFees(int days) {
		BigDecimal extraDays = new BigDecimal(days);
		BigDecimal amount = new BigDecimal("3.00").multiply(extraDays);
		return amount;
	}

}
