package darman.part7;

import java.util.Scanner;

public class Exo7_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tableau = new String[] {"centre", "de", "formation", "afpa", "cda"};
		boolean flag = false;
		System.out.print("Rechercher un mot : ");
		String word = sc.nextLine();
		for(int i = 0; i < tableau.length; i++) {
			if(word.equals(tableau[i])) {
				flag = true;
				
			}
			
		}
		if(flag) {
			System.out.println("Le mot existe.");
		}
		else {
			System.out.println("Le mot n'existe pas.");
		}
		sc.close();
	}

}
