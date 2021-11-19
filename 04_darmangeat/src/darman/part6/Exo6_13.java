package darman.part6;

import java.util.Scanner;

public class Exo6_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le nombre de valeur que vous souhaitez ajouter : ");
		int size = sc.nextInt(), grande = 0, place = 0;
		int[] tableau = new int[size];
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.print("Entrer la valeur n°" + (i+1) + " : ");
			tableau[i] = sc.nextInt();
			if(tableau[i] > grande) {
				grande = tableau[i];
				place = i+1;
			}
			
		}
		System.out.println("La valeur la plus grande du tableau est : " + grande);
		System.out.println("Elle se situe à la place n°" + place);
		sc.close();
	}

}
