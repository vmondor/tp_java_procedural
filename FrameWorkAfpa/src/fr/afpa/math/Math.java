package fr.afpa.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Math {

	static final BigDecimal TAUX_EURO_DOLLAR = new BigDecimal("1.18674");
	static final BigDecimal TAUX_DOLLAR_EURO = new BigDecimal("0.88");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static BigDecimal euroToDollar(BigDecimal euro) {

		return euro.multiply(TAUX_EURO_DOLLAR).setScale(2, RoundingMode.HALF_UP);
	}

	public static BigDecimal dollarToEuro(BigDecimal dollar) {

		return dollar.multiply(TAUX_DOLLAR_EURO).setScale(2, RoundingMode.HALF_UP);
	}
	
	public static long factorielleFor(long number) {
		long res = 1;
		if(number < 0) {
			return -1;
		}
		else if(number > 20) {
			return -2;
		}
		for(int i = 1; i <= number; i++) {
			res *= i;
		}
		return res;
	}
	
	public static long factorielle(long number) throws IllegalArgumentException {
		if(number == 1 | number == 0) {
			return 1;
		}
		if(number * factorielle(number-1) < 0) {
			throw new IllegalArgumentException();
		}
		return number * factorielle(number-1);
	}

}
