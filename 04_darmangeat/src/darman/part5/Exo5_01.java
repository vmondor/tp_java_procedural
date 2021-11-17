package darman.part5;

import java.util.Scanner;

public class Exo5_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		do {
			System.out.print("Entrez un chiffre entre 1 et 3 : ");
			a = sc.nextInt();
		}
		while(a < 1 | a > 3);
		sc.close();
	}

}
