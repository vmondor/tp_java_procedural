import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AfficheFichierProjet {

	public static void main(String[] args) throws IOException {
		System.out.println("Contenu du répertoire projet :");
		String repertoireCourant = System.getProperty("user.dir");
		File dir = new File(repertoireCourant);
		File[] liste = dir.listFiles();
		for (int i = 0; i < liste.length; i++) {
			if (liste[i].isFile()) {
				System.out.println(liste[i].getName());
			} else if (liste[i].isDirectory()) {
				System.out.println("[" + liste[i].getName() + "]");
			}
		}
		System.out.println();
		readFileText();
	}

	public static void readFileText() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Entrez le chemin du fichier : ");
			// C:\\Users\\valen\\Documents\\file.txt
			// Le fichier d'entrée
			File file = new File(sc.nextLine());
			// Créer l'objet File Reader
			FileReader fr = new FileReader(file);
			// Créer l'objet BufferedReader
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;
			sc.close();
			while ((line = br.readLine()) != null) {
				// ajoute la ligne au buffer
				sb.append(line);
				sb.append("\n");
			}
			fr.close();
			System.out.println("Contenu du fichier: ");
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}

}