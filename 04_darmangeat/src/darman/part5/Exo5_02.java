package darman.part5;

import java.util.Scanner;

public class Exo5_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		do {
			System.out.print("Entrez un nombre entre 10 et 20 : ");
			a = sc.nextInt();
			if(a > 20) {
				System.out.println("Plus petit !");
			}
			else if(a < 10) {
				System.out.println("Plus grand !");
			}
		}
		while(a < 10 | a > 20);
		sc.close();
	}

}
