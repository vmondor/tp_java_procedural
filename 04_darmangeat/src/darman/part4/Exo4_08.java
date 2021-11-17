package darman.part4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exo4_08 {

	public static void main(String[] args) {
		int jour, mois, annee;
		Date day = new Date();
		SimpleDateFormat formater = null;
		formater = new SimpleDateFormat("dd-MM-yyyy");
		String date = formater.format(day);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero Jour : ");
		jour = sc.nextInt();
		System.out.print("Numero Mois : ");
		mois = sc.nextInt();
		System.out.print("Numero Année : ");
		annee = sc.nextInt();
		String inputDate = jour + "-" + mois + "-" + annee;
		
		if(inputDate.equals(date)) {
			System.out.println("Date valide");
		}
		else {
			System.out.println("Date non valide");
		}
		sc.close();
	}

}
