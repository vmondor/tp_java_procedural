package darman.part6;

import java.util.Scanner;

public class Exo6_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tableau = new int[9];
		int moyenne = 0;
		for (int i = 0; i < tableau.length; i++) {
			System.out.print("Entrer la note " + (i+1) + " : ");
			tableau[i] = sc.nextInt();
			moyenne += tableau[i];
		}
		System.out.println("La moyenne est de : " + (moyenne / tableau.length));
		sc.close();
	}

}
