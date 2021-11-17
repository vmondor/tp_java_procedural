package darman.part4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exo4_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double prix = 0;
		System.out.print("Combien de photocopies voulez-vous ? ");
		int nbr = sc.nextInt();
		
		for(int i = 0; i < nbr; i++) {
			if(i <= 10) {
				prix += 0.10;
			}
			else if (i > 10 & i <= 20) {
				prix += 0.09;
			}
			else if (prix > 20){
				prix += 0.08;
			}
		}
		DecimalFormat total = new DecimalFormat("0.##");
		System.out.println("La facture est de " + total.format(prix) + " €");
		sc.close();
		
	}

}