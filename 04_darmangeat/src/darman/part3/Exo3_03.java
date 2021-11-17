package darman.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo3_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> prenoms = new ArrayList<String>();
		System.out.println("Entrez 3 prenoms :");
		System.out.print("Prenom 1 : ");
		prenoms.add(sc.nextLine());
		System.out.print("Prenom 2 : ");
		prenoms.add(sc.nextLine());
		System.out.print("Prenom 3 : ");
		prenoms.add(sc.nextLine());
		prenoms.sort(String::compareToIgnoreCase);
		System.out.println(prenoms);
		sc.close();
	}

}
