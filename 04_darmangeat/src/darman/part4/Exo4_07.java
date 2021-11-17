package darman.part4;

import java.util.Scanner;

public class Exo4_07 {

	public static void main(String[] args) {
		String contrat = "refusé";
		boolean accept = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez votre age : ");
		int age = sc.nextInt();
		System.out.print("Depuis combien de temps avez-vous le permis /an : ");
		int permis = sc.nextInt();
		System.out.print("Combien d'accident avez-vous fait : ");
		int accident = sc.nextInt();
		System.out.print("Depuis combien d'années êtes-vous inscrit chez nous : ");
		int assurance = sc.nextInt();
		if (age < 25 & permis < 2 & accident == 0) {
			contrat = "rouge";
		}

		else if (age < 25 & permis >= 2 | age >= 25 & permis < 2) {
			if (accident == 0) {
				contrat = "orange";
			}
			if (accident == 1) {
				contrat = "rouge";
			}
			if (accident < 1) {
				accept = false;
			}
		}

		else if (age > 25 & permis > 2) {
			contrat = "vert";
			if (accident == 1) {
				contrat = "orange";
			} else if (accident == 2) {
				contrat = "rouge";
			} else if (accident > 2) {
				contrat = "refusé";
			}
		} else {
			accept = false;
		}

		if (accept & assurance > 5) {
			if (contrat == "vert") {
				contrat = "bleu";
			} else if (contrat == "orange") {
				contrat = "vert";
			} else if (contrat == "rouge") {
				contrat = "orange";
			}
		}
		System.out.println("Vous avez le contrat " + contrat);
		sc.close();
	}

}
