package darman.part6;

public class Exo6_11 {

	public static void main(String[] args) {
		int[] tableau1 = new int[] {4, 8, 7, 12};
		int[] tableau2 = new int[] {3, 6};
		int shtroumpf = 0;
		
		for(int i = 0; i < tableau1.length; i++) {
			for(int j = 0; j < tableau2.length; j++) {				
			shtroumpf += (tableau1[i] * tableau2[j]);
			}
		}
		System.out.println(shtroumpf);

	}

}
