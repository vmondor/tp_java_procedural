package darman.part5;

import java.util.Scanner;

public class Exo5_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");
		int a = sc.nextInt(), i, result = 1;
		sc.close();
		
		for(i = 1; i <= a; i++) {
			result *= i;
		}
		System.out.println(result);

	}

}
