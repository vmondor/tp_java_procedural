package darman.part4;

import java.util.Scanner;

public class Exo4_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quel est votre age ? ");
		int age = sc.nextInt();
		System.out.print("Quel est votre sexe (m/f) ? ");
		sc.nextLine();
		char sexe = sc.next().charAt(0);
		
		if((sexe == 'm' & age > 20) || (sexe == 'f' & age >= 18 & age <= 35)) {
			System.out.println("Vous êtes imposable");
		}
		else {
			System.out.println("Vous n'êtes pas imposable");
		}
		sc.close();
		
	}

}
