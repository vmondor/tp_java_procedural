import java.util.Scanner;

public class Item_1 {

	public static void main(String[] args) {
		String chaine1, chaine2;
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("Chaine 1 \t : ");
			chaine1 = new String(sc.nextLine());
			System.out.print("Chaine 2 \t : ");
			chaine2 = new String(sc.nextLine());

			if (chaine1.equals(chaine2)) {
				System.out.println("IDENTIQUE");
			}
			if (chaine1.equals("FIN") || chaine2.equals("FIN")) {
				break;
			}
		}
		sc.close();
		System.out.println("Programme terminé");
	}
}