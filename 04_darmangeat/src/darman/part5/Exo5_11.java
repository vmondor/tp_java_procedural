package darman.part5;

import java.util.Scanner;

public class Exo5_11 {

	public static void main(String[] args) {
		int totalChevaux, chevauxParier, i, ordreChance = 1, desordreChance = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le nombre de chevaux partants : ");
		totalChevaux = sc.nextInt();
		System.out.print("Entrez le nombre de chevaux joués : ");
		chevauxParier = sc.nextInt();
		sc.close();
		for(i = 1; i < chevauxParier; i++) {
			ordreChance = ordreChance * (i + totalChevaux - chevauxParier);
			desordreChance = desordreChance * i;
		}
		System.out.println("Dans l'ordre, une chance sur " + ordreChance);
		System.out.println("Dans le désordre, une chance sur " + ordreChance / desordreChance);
		
	}

}
