package fr.afpa.util;

import java.math.BigDecimal;
import java.util.Scanner;
import fr.afpa.math.Math;

public class Convertisseur {

	public static void main(String[] args) {
		int devise = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Choisis la conversion : 1 pour (de € à $) / 2 pour ($ à €) : ");
		devise = sc.nextInt();

		sc.nextLine();
		System.out.print("Entrez le montant : ");
		BigDecimal number = new BigDecimal(sc.nextLine());

		if (devise == 1) {
			System.out.println(number + "€ = " + Math.euroToDollar(number) + "$");

		} else if (devise == 2) {
			System.out.println(number + "$ = " + Math.dollarToEuro(number) + "€");
		}

		sc.close();

	}

}
