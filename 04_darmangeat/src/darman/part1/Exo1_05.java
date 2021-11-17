package darman.part1;

public class Exo1_05 {

	public static void main(String[] args) {
		/**
		Début
		A <- 5
		B <- 2
		A <- B
		B <- A
		Fin
		**/
		int a = 5;
		int b = 2;
		a = b;
		b = a;
		System.out.println("Valeur de a = " + a);
		System.out.println("Valeur de b = " + b);

	}

}
