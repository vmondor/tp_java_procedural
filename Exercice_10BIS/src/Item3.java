import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item3 {

	static List<Double> notes = new ArrayList<Double>();
	
	public static void main(String[] args) {
		
		saisie_params();
		tri();
		System.out.println();
		valeur_min(notes);
		valeur_max(notes);
		valeur_mediane(notes);
		valeur_moyenne(notes);
	}
	
	static void saisie_params() {
		Scanner sc = new Scanner(System.in);
		Double note;
		int i = 1;
		do {
			System.out.print("Entrez la note " + i + " : ");
			note = sc.nextDouble();
			if( note != 0)
				notes.add(note);
				i++;
		} while(note != 0);
		sc.close();
	}
	
	static void tri() {
		Double temp;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < notes.size() - 1; i++) {
				if (notes.get(i) > notes.get(i+1)) {
					temp = notes.get(i);
					notes.set(i, notes.get(i+1));
					notes.set(i+1, temp);
					flag = true;
				}
			}
		}
		System.out.print("Tableau \t: " + notes);
	}
	
	static void valeur_moyenne(List<Double> tab) {
		DecimalFormat df = new DecimalFormat("#.##");
		float moyenne = 0;
		for(int i = 0; i < tab.size(); i++) {
			moyenne += tab.get(i);
		}
		moyenne = moyenne / tab.size();
		System.out.println("Valeur moyenne \t: " + df.format(moyenne));
	}
	
	static void valeur_min(List<Double> tab) {
		System.out.println("Valeur minimal \t: " + tab.get(0));
	}
	
	static void valeur_max(List<Double> tab) {
		System.out.println("Valeur max \t: " + tab.get(tab.size() -1));
	}
	
	static void valeur_mediane(List<Double> tab) {
		Double mediane = null;
		Double sup = tab.get(tab.size() / 2);
		Double inf = null;
		if(tab.size() % 2 == 0) {
			inf = tab.get(tab.size() / 2) - 1;
			mediane = (inf + sup) / 2;
		}
		else {
			mediane = sup;
		}
		System.out.println("Valeur mediane \t: " + mediane);
	}

}
