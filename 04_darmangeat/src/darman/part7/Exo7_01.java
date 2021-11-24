package darman.part7;

import java.util.Scanner;

public class Exo7_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le nombre total de valeurs du tableau : ");
		int size = sc.nextInt();
        boolean consecutif = true;
		int[] tableau = new int[size];
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.print("Entrer la valeur n°" + (i+1) + " : ");
			tableau[i] = sc.nextInt();
            if(i > 0 && tableau[i] != tableau[i-1] +1){
                consecutif = false;
            }
		}

		for(int value : tableau) {
			System.out.println(value);
		}

        if(consecutif){
            System.out.println("Ces éléments sont consécutif");
        }
        else {
            System.out.println("Ces éléments ne sont pas consécutif");
        }
		sc.close();

	}

}

