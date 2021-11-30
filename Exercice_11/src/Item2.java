
public class Item2 {

	public static void main(String[] args) {
		tracerLigne();
		System.out.println();
		tracerLigne(40);
		System.out.println();
		tracerLigne("fzeufhdisohfieznfkds");
		System.out.println(tracerLignes(10));
		
	}
	
	static void tracerLigne() {
		for(int i = 0; i < 20; i++) {
			System.out.print("- ");
		}
	}
	static void tracerLigne(float nb) {
		for(int i = 0; i < nb; i++) {
			System.out.print("- ");
		}
	}
	static void tracerLigne(String phrase) {
		System.out.println(phrase);
	}
	
	static int tracerLignes(int n) {
		if (n == 1) return 1;
		else return	n * tracerLignes (n-1);
	}

}
