import java.util.Scanner;

public class Item_2 {

	public static void main(String[] args) {
		char code;
		String eleve = "L'�l�ve";
		System.out.print("L'�l�ve \t: ");
		for(int i = 0; i < eleve.length(); i++) {
			code = eleve.charAt(i);
			System.out.print(String.format("\\u%04x", (int) code) + " ");	
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez une chaine de caract�re : ");
		String chaine = new String(sc.nextLine());
		System.out.print("Votre chaine \t: ");
		for(int i = 0; i < chaine.length(); i++) {
			code = chaine.charAt(i);
			System.out.print(String.format("\\u%04x", (int) code) + " ");	
		}
		sc.close();
	}

}
