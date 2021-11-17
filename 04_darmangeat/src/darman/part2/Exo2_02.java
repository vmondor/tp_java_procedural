package darman.part2;

import java.util.Scanner;

public class Exo2_02 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Entrez un nombre : ");
	        int nombre = sc.nextInt();
	        int carre = nombre * nombre;
	        System.out.println("Le carré de votre nombre est " + carre);
	        sc.close();
	}

}
