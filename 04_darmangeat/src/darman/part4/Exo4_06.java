package darman.part4;

import java.util.Scanner;

public class Exo4_06 {
	public static void main(String[] args) {
		int a, b, c, d;
		boolean c1, c2, c3, c4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez les scores des 4 candidats");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		c1 = a > 50;
		c2 = b > 50 | c > 50 | d > 50;
		c3 = a >= b & a >= c & a >= d;
		c4 = a >= 12.5;
		if (c1) {
			System.out.println("Elu premier tour");
		}
		else if(c2 | !c4) {
			System.out.println("Battu, elimine, sorti !!!");
		}
		else if(c3) {
			System.out.println("Ballotage favorable");
		}
		else {
			System.out.println("Ballotage défavorable");
		}
		sc.close();
	}

}
