package fr.afpa.math;

import java.math.BigDecimal;

public class TestMath {

	public static void main(String[] args) {
		euroToDollarTest1();
		euroToDollarTest2();
		dollarToEuroTest1();
		dollarToEuroTest2();
		System.out.println();
		factorielleTest();

	}

	public static void euroToDollarTest1() {
		if (Math.euroToDollar(new BigDecimal("10")).equals(new BigDecimal("11.87"))) {
			System.out.println("euroToDollarTest1 réussi");
		} else {
			System.err.println("euroToDollarTest1 en échec : 10 euros valent 11.87 dollars");
		}
	}

	public static void euroToDollarTest2() {
		if (Math.euroToDollar(new BigDecimal("10")).equals(new BigDecimal(11.87))) {
			System.out.println("euroToDollarTest2 réussi");
		} else {
			System.err.println("euroToDollarTest2 en échec : 10 euros valent 11.87 dollars");
		}
	}

	public static void dollarToEuroTest1() {
		if (Math.dollarToEuro(new BigDecimal("10")).equals(new BigDecimal("8.80"))) {
			System.out.println("dollarToEuroTest1 réussi");
		} else {
			System.err.println("dollarToEuroTest1 en échec : 10 dollars valent 8.80 euros");
		}
	}

	public static void dollarToEuroTest2() {
		if (Math.dollarToEuro(new BigDecimal("10")).equals(new BigDecimal(8.80))) {
			System.out.println("dollarToEuroTest2 réussi");
		} else {
			System.err.println("dollarToEuroTest2 en échec : 10 dollars valent 8.80 euros");
		}
	}
	
	public static void factorielleTest() {
		if(Math.factorielle(0) == 1) {
			System.out.println("factorielleTest de 0 vaut 1 : Test OK");
		} else {
			System.err.println("factorielleTest échoué : factorielle(0) == 1");
		}
		try {
			Math.factorielle(1);
			System.out.println("factorielleTest(1) OK");
		}
		catch(Exception e) {
			System.err.println("factorielleTest(1) en échec : factorielle(1) == 1");
		}
		try {
			Math.factorielle(21);
			System.err.println("factorielleTest(21) en échec : Le nombre doit être inférieur à 21");
		}
		catch(IllegalArgumentException e) {
			System.out.println("factorielleTest(21) OK");
		}
		try {
			Math.factorielle(-1);
			System.err.println("factorielleTest(-1) en échec : Le nombre doit être >= 0");
		}
		catch(StackOverflowError e) {
			System.out.println("factorielleTest(-1) OK");
		}
		catch(Exception e) {
			System.err.println("factorielleTest(-1) en échec : L'exception doit être StackOverflowError");
		}
		try {
			Math.factorielle(45);
			System.err.println("factorielleTest(45) en échec : Le nombre doit être inférieur à 21");
		}
		catch(IllegalArgumentException e) {
			System.out.println("factorielleTest(45) OK");
		}
		catch(Exception e) {
			System.err.println("factorielleTest(45) en échec : L'exception doit être IllegalArgumentException");
		}
	}

}
