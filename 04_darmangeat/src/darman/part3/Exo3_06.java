package darman.part3;

import java.util.Scanner;

public class Exo3_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel age as-tu ?");
		int age = sc.nextInt();
		
		switch(age) {
			case 6:
			case 7:
				System.out.println("Catégorie Poussin");
				break;
			case 8:
			case 9:
				System.out.println("Catégorie Pupille");
				break;
			case 10:
			case 11:
				System.out.println("Catégorie Minime");
				break;
			default:
				System.out.println("Catégorie Cadet");
		}
		
		sc.close();
	}

}
