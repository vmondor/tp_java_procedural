package darman.part2;

import java.util.Scanner;

public class Exo2_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quel est votre prenom ? ");
		String prenom = sc.nextLine();
		System.out.println("Bonjour " + prenom + " !");
		sc.close();

	}

}
