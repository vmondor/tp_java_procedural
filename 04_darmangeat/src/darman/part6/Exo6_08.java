package darman.part6;

import java.util.Scanner;

public class Exo6_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le nombre de valeur que vous souhaitez ajouter : ");
		int size = sc.nextInt(), moins = 0, plus = 0;
		int[] tableau = new int[size];
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.print("Entrer la valeur n°" + (i+1) + " : ");
			tableau[i] = sc.nextInt();
			if(tableau[i] < 0) {
				moins++;
			}
			else if(tableau[i] >= 0) {
				plus++;
			}
		}
		
		System.out.println("Nombre de valeurs négatives : " + moins);
		System.out.println("Nombre de valeurs positives : " + plus);
		sc.close();
	}

}
