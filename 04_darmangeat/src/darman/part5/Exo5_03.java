package darman.part5;

import java.util.Scanner;

public class Exo5_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");
		int a = sc.nextInt();
		for(int i = 0; i < 10; i++) {
			a++;
			System.out.println(a);
		}
		sc.close();

	}

}
