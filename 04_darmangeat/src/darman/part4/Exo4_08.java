package darman.part4;

import java.util.Scanner;

public class Exo4_08 {

	public static void main(String[] args) {
		int jour, mois, annee;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero Jour : ");
		jour = sc.nextInt();
		System.out.print("Numero Mois : ");
		mois = sc.nextInt();
		System.out.print("Numero Année : ");
		annee = sc.nextInt();
		
		if((jour > 0 & jour < 32) && (mois > 0 && mois < 13) && (annee != 0)) {
			if(mois == 2 && jour > 29)
				flag = false;
		}
		else {
			flag = false;
		}
		if(flag)
			System.out.println("Date Valide");
			
		else
			System.out.println("Date non valide");

		sc.close();
	}

}
