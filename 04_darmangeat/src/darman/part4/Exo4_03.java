package darman.part4;

import java.util.Scanner;

public class Exo4_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez l'heure, les minutes et les secondes :");
		System.out.print("Heures : ");
		int heures = sc.nextInt();
		System.out.print("Minutes : ");
		int minutes = sc.nextInt();
		System.out.print("Secondes : ");
		int secondes = sc.nextInt();
		int sec = secondes + 1;
		System.out.println("Dans une seconde, il sera " + heures + " heure(s) " + minutes + " minute(s) et " + sec + " secondes(s)");
		sc.close();
	}

}
