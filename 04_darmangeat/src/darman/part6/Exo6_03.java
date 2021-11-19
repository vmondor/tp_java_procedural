package darman.part6;

import java.util.Scanner;

public class Exo6_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tableau = new int[9];
		for (int i = 0; i < tableau.length; i++) {
			System.out.print("Entrer la note " + (i+1) + " : ");
			tableau[i] = sc.nextInt();
		}
		for(int value : tableau) {
			System.out.println(value);
		}
		sc.close();
	}

}
