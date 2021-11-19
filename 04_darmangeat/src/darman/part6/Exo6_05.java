package darman.part6;

public class Exo6_05 {

	public static void main(String[] args) {
		int[] tableau = new int[7];
		tableau[0] = 1;
		System.out.println(tableau[0]);
		for(int k = 1; k < tableau.length; k++) {
			tableau[k] = tableau[k-1] + 2;
			System.out.println(tableau[k]);
		}

	}

}
