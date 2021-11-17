package darman.part3;
import java.util.Scanner;

public class Exo3_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le premier nombre : ");
		int nombre1 = sc.nextInt();
		System.out.print("Entrez le deuxieme nombre : ");
		int nombre2 = sc.nextInt();
		
		if ((nombre1 < 0 & nombre2 < 0) || (nombre1 > 0 & nombre2 > 0)) {
			System.out.println("Leur produit est positif");
		}
		else {
			System.out.println("Leur produit est négatif");
		}
		sc.close();

	}

}
