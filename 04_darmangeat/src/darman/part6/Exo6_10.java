package darman.part6;

public class Exo6_10 {

	public static void main(String[] args) {
		int[] tableau1 = new int[] {4, 8, 7, 9, 1, 5, 4, 6};
		int[] tableau2 = new int[] {7, 6, 5, 2, 1, 3, 7, 4};
		int[] tableau3 = new int[tableau1.length];
		
		for(int i = 0; i < tableau1.length; i++) {
			tableau3[i] = tableau1[i] + tableau2[i];
			System.out.println(tableau3[i]);
		}
		
	}

}
