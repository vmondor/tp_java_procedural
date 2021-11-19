package darman.part6;

public class Exo6_09 {

	public static void main(String[] args) {
		int somme = 0;
		int[] tableau = new int[] {5, 5, 10, 10, 20};
		for(int value : tableau) {
			somme += value;
		}
		System.out.println(somme);

	}

}
