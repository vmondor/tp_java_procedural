package darman.part3;

import java.util.Scanner;

public class Exo3_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");
		int nombre = sc.nextInt();
		if(nombre < 0) {
			System.out.println(nombre + " est négatif.");
		}
		else if(nombre > 0) {
			System.out.println(nombre + " est positif");
		}
		
		sc.close();
	}

}
