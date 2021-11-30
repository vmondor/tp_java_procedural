import java.util.Scanner;

public class Item_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un site : ");
		String url = sc.nextLine();
		String[] mots = url.split("/");
		for(int i = 0; i < mots.length; i++) {
			if(i == 0) {
				System.out.println("Protocole : " + mots[i]);
			}
			if(i == 2) {
				System.out.println("Nom du site : " + mots[i]);
			}
			if(i == 3) {
				System.out.println("fichier : " + mots[i]);
			}
			if(i > 3) {
				System.out.println("Votre url n'est pas valide");
			}
		}
		sc.close();

	}

}
