package darman.part7;

import java.util.Arrays;

public class Exo7_06 {

	public static void main(String[] args) {
		int [] tab1 = new int[] {1, 3, 5, 7, 9};
		int [] tab2 = new int[] {2, 4, 6, 8, 10};
		int size = tab1.length + tab2.length, temp;
		int [] tab3 = new int[size];
		
		System.arraycopy(tab1, 0, tab3, 0, tab1.length);
		System.arraycopy(tab2, 0, tab3, tab1.length, tab2.length);
		
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = 0; i < tab3.length -1; i++) {
				if(tab3[i] > tab3[i + 1]) {
					temp = tab3[i];
					tab3[i] = tab3[i+1];
					tab3[i + 1] = temp;
					flag = true;
				}
			}
		}
		System.out.println(Arrays.toString(tab3));

	}

}
