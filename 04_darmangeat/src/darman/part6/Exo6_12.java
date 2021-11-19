package darman.part6;

import java.util.Scanner;

public class Exo6_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le nombre de valeur que vous souhaitez ajouter : ");
		int size = sc.nextInt();
		int[] tableau = new int[size];
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.print("Entrer la valeur n°" + (i+1) + " : ");
			tableau[i] = sc.nextInt() + 1;
			
		}
		for(int value : tableau) {
			System.out.println(value);
		}
		sc.close();

	}

}
