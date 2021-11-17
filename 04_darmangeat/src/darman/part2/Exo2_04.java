package darman.part2;

import java.util.Scanner;

public class Exo2_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le prix hors taxe de l'article : ");
		float ht = sc.nextFloat();
		System.out.print("Entrez le nombre d'articles : ");
		int nombre = sc.nextInt();
		System.out.print("Entrez le taux de TVA : ");
		float tva = sc.nextFloat() / 100;
		tva = (ht * tva) * nombre;
		float ttc = (ht + tva) * nombre;
		System.out.println("Prix d'un article : " + ht + " € HT");
		System.out.println("Nombres d'articles : " + nombre);
		System.out.println("Taux TVA : " + tva + " €");
		System.out.println("Total : " + ttc + " € TTC");
		
		sc.close();
		
	}

}