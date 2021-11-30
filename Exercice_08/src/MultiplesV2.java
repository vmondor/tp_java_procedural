import java.util.Scanner;

/**
 * Objectif: Les structures iteratives while et do...while. Les expressions
 * bool�ennes.
 * <p>
 * Affichage des multiples d'un nombre sur un intervalle (version 2)
 * 
 * @author AFPA
 * @version 1.0
 */
public class MultiplesV2 {
	static final int maxCol = 8;
	static final int maxLigne = 10;
	static int bInf, bSup, nb, x;
	static char rep;
	static Scanner sc = new Scanner(System.in);

	public static void main(String arg[]) {

		do {
			saisie_params();
			afficher_multiples();
			attendre_entree();

		} while (rep == 'o' || rep == 'O');// fin du bloc do-while
		sc.close();

	}
	
	/**
	 * Objectif: Saisie des parametres.
	 * <p>
	 * 
	 * @author AFPA
	 * @version 1.0
	 */
	public static void saisie_params() {

		do {

			System.out.print("\n\tNombres divisibles par : ");
			nb = sc.nextInt();

			System.out.print("\tLimite inferieure      : ");
			bInf = sc.nextInt();

			System.out.print("\tLimite superieure      : ");
			bSup = sc.nextInt();

			if (nb == 0)
				System.out.println("Le nombre divisible doit être supérieur à 0");
			else if (bInf >= bSup)
				System.out.println("La limite inférieure doit être inférieure à la limite supérieure");
		} while (nb == 0 | bInf >= bSup);
		System.out.println("\n\nAffichage des multiples de " + nb + " entre " + bInf + " et " + bSup + "\n");
	}

	/**
	 * Objectif:
	 * <p>
	 * Affichage des multiples d'un nombre sur un intervalle
	 * 
	 * @author AFPA
	 * @version 1.0
	 */
	static void afficher_multiples() {
		x = bInf;
		while (x <= bSup) {
			if (x % nb == 0)
				System.out.print("\t(" + x++ + ")");
			else
				System.out.print("\t " + x++);
			if ((x - bInf) % maxCol == 0)
				System.out.println(); // maxCol caracteres affiches
			if ((x - bInf) % (maxCol * maxLigne) == 0) {
				System.out.println("\nAppuyer sur ENTREE ..."); // maxLigne lignes affiches
				sc.nextLine();
			}
		} // while
		//-------------   TESTER FIN
	}
	/**
	 * Objectif: Attendre une entree pour afficher la suite.
	 * <p>
	 * 
	 * @author AFPA
	 * @version 1.0
	 */
	static void attendre_entree() {
		do {
			System.out.print("\n\nVoulez-vous continuer (O/N) : ");
			rep = (sc.nextLine()).charAt(0);
		} while (rep != 'o' && rep != 'O' && rep != 'n' && rep != 'N');
	}
}