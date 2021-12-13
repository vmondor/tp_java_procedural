import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListeCourses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> liste = new ArrayList<>();
		char choix;;
		String article = "";
		do {
			System.out.println("Entrer un nouvel article (n) :");
			System.out.println("Pour sortir de l'application (q) :");
			System.out.print("Donnez votre choix : ");
			choix = sc.nextLine().charAt(0);
			if(choix == 'q') {
				break;
			}
			else if(choix == 'n') {
				System.out.print("Entrez le nom de l'article : ");
				article = sc.nextLine();
				liste.add(article);
			}
			else {
				continue;
			}
		
		} while(choix != 'q');
		
		System.out.println("\nPanier :");
		liste.forEach(x->System.out.println(x));
		sc.close();

	}
}
