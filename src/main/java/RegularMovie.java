import java.math.BigDecimal;
	
	public class RegularMovie extends Movie {
		public RegularMovie(String title) {
			super(title, "regular");
		}
		@Override
		public BigDecimal calculateFees(int days) {
			return regCalFee(days);
		}
		private BigDecimal regCalFee(int days) {
			if (days <= 2){
				BigDecimal amount = new BigDecimal("2.00");
				return amount;
			} else {
			BigDecimal extraDays = new BigDecimal(days - 2);
				BigDecimal amount = new BigDecimal("1.5").multiply(extraDays).add(new BigDecimal("2.00"));
			return amount;
		}
		}
		@Override
		public String getPriceCode() {
			return this.priceCode;
}
}