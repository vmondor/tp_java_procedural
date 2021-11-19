package darman.part6;

import java.util.Scanner;

public class Exo6_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le nombre total de note de la classe : ");
		int size = sc.nextInt(), moyenne = 0, notes = 0;
		int[] tableau = new int[size];
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.print("Entrer la note n°" + (i+1) + " : ");
			tableau[i] = sc.nextInt();
			moyenne += tableau[i];
		}
		for(int value : tableau) {
			if(value > moyenne / tableau.length) {
				notes++;
			}
		}
		System.out.println("Il y a " + notes + " note(s) au dessus de la moyenne de la classe qui est " + (moyenne/tableau.length));
		sc.close();

	}

}
