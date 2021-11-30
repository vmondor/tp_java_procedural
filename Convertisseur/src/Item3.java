import java.math.BigDecimal;

public class Item3 {

	public static void main(String[] args) {
		BigDecimal euro = new BigDecimal(10);
		if(euroToDollarTest(euro)) {
			System.out.println("Test Valide");
		}
		else {
			System.out.println("Test non valide");
		}

	}
	
	public static boolean euroToDollarTest(BigDecimal euro) {
		BigDecimal euroConvert = Item1.euroToDollar(euro);
		BigDecimal dollar = new BigDecimal("11.87");
		int res = euroConvert.compareTo(dollar);
		if(res == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
