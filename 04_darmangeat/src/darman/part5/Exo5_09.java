package darman.part5;

import java.util.Scanner;

public class Exo5_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, grand = 0, place = 0, a = 1;
		
		do {
			System.out.print("Entrez le nombre numero " + i + " : ");
			a = sc.nextInt();
			if(a > grand){
				grand = a;
				place = i;
			}
			i++;
		}
		while(a != 0);
		System.out.println("Le plus grand nombre est " + grand);
		System.out.println("C'était le nombre numero " + place);
		sc.close();

	}

}
