package darman.part7;

import java.util.Arrays;
import java.util.Scanner;


public class Exo7_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] tab = new int[] {12, 8, 4, 45, 64, 9, 2}, tabCopy = null;
		System.out.println("Tableau : " + Arrays.toString(tab));
		System.out.print("Donner l'indice de la valeur à supprimer : ");
		int number = sc.nextInt();
		
		for(int i = 0; i < tab.length; i++) {
			if(i == number) {
				for(int j = i; j < tab.length-1; j++) {
					tab[i] = tab[i+1];
					i++;
				}
			}
		}
		sc.close();
		tabCopy = Arrays.copyOf(tab, tab.length-1);
		System.out.println("Tableau : " + Arrays.toString(tabCopy));
	}

}
