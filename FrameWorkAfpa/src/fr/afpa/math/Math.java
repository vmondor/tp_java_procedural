package fr.afpa.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Math {

	static final BigDecimal TAUX_EURO_DOLLAR = new BigDecimal("1.18674");
	static final BigDecimal TAUX_DOLLAR_EURO = new BigDecimal("0.88");

	public static void main(String[] args) {
//		factorielleBig(new BigInteger("9080"));

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
	public static BigInteger factorielleBigRes(BigInteger number) throws IllegalArgumentException {
		if(number.compareTo(new BigInteger("0")) == 0 | number.compareTo(new BigInteger("1")) == 0) {
			return new BigInteger("1");
		}
		if(number.multiply(factorielleBigRes((number.subtract(new BigInteger("1"))))).compareTo(new BigInteger("0")) == -1) {
			throw new StackOverflowError();
		}
		return number.multiply(factorielleBigRes(number.subtract(new BigInteger("1"))));
	}
	
	public static BigInteger factorielleBig(BigInteger number) {
		
		BigInteger i = new BigInteger("1");
		BigInteger res = new BigInteger("1");
		try {
			if(number.equals(new BigInteger("9075")) | number.compareTo(new BigInteger("9075")) == 1 | number.compareTo(new BigInteger("0")) == -1) {
				throw new StackOverflowError();
			}
		
			while(i.compareTo(number.add(new BigInteger("1"))) != 0) {
				res = res.multiply(i);
				i = i.add(BigInteger.ONE);
			}
			System.out.print("La factorielle est : ");
			return res;
		} catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Merci de rentrer un nombre");
			return new BigInteger("0");
		}
	}

}
