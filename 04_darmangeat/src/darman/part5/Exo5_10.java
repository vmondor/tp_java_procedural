package darman.part5;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo5_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, addition = 0;
		List<Integer> ticket = new ArrayList<Integer>();
		System.out.println("Entrez les prix de vos articles et terminez par 0 : ");
		
		do {
			a = sc.nextInt();
			if(a != 0) {				
			ticket.add(a);
			}
		}
		while(a != 0);
		
		for(int i = 0; i < ticket.size(); i++) {
			addition += ticket.get(i);
		}
		
		System.out.println("Total a payer : " + addition + " €");
		System.out.print("Encaissement : ");
		int montant = sc.nextInt();
		int monnaie = montant - addition;
		System.out.println("La facture est de : " + addition + " €");
		System.out.println("Vous avez donné : " + montant + " €");
		System.out.println("Votre monnaie est de : " + monnaie + " €");
		sc.close();

	}

}
