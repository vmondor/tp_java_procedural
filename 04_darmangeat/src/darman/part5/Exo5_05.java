package darman.part5;

import java.util.Scanner;

public class Exo5_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");
		int a = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			int result = a * i;
			System.out.println(a + " x " + i + " = " + result);
		}
		sc.close();

	}

}
