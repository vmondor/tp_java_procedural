package darman.part4;

import java.util.Scanner;

public class Exo4_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez l'heure et les minutes :");
		System.out.print("Heures : ");
		int heures = sc.nextInt();
		System.out.print("Minutes : ");
		int minutes = sc.nextInt();
		int min = minutes + 1;
		System.out.println("Dans une minute, il sera " + heures + " heure(s) " + min);
		sc.close();
	}

}
