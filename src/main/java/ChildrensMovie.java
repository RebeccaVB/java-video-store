import java.math.BigDecimal;

public class ChildrensMovie extends Movie {
	public ChildrensMovie(String title){
		super (title, "childrens");
	}
	public BigDecimal calculateFees(int days) {
		return childrenCalFee(days);
	}
	private BigDecimal childrenCalFee(int days) {
		if (days <= 3){
			BigDecimal amount = new BigDecimal("1.50");
			return amount;
		} else {
		BigDecimal extraDays = new BigDecimal(days-3);
		BigDecimal amount = new BigDecimal("1.50").multiply(extraDays);
		return amount;
	}
	}
		@Override
	public String getPriceCode() {
		return this.priceCode;
}
}