import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item1 {

	static final BigDecimal TAUX_EURO_DOLLAR = new BigDecimal("1.18674");
	
	public static void main(String[] args) {
		BigDecimal euro = new BigDecimal("10");
		System.out.println(euroToDollar(euro));
	}
	
	public static BigDecimal euroToDollar(BigDecimal euro) {
		
		return euro.multiply(TAUX_EURO_DOLLAR)
				.setScale(2, RoundingMode.HALF_UP);
	}


}
