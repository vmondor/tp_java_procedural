import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item2 {

	static final BigDecimal TAUX_DOLLAR_EURO = new BigDecimal("0.88");
	
	public static void main(String[] args) {
		BigDecimal dollar = new BigDecimal("10");
		System.out.println(dollarToEuro(dollar));
	}
	
	public static BigDecimal dollarToEuro(BigDecimal dollar) {
		
		
		return dollar.multiply(TAUX_DOLLAR_EURO)
				.setScale(2, RoundingMode.HALF_UP);
	}

}
