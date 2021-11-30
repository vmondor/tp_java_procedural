import java.util.Arrays;

public class Item_1 {

	public static void main(String[] args) {
		int[] tab1 = new int[] {2, 54, 67, 8, 3, 87, 99, 1, 5, 10};
		int[] tab2 = tab1.clone();
		// int[] tab2 = tab1;
		System.out.println("tab1 \t\t: " + Arrays.toString(tab1));
		System.out.println("tab2 \t\t: " + Arrays.toString(tab2));
		for(int i = 0; i < tab1.length; i++) {
			tab1[i] = tab1[i] + 10;
		}
		System.out.println("tab1 + 10 \t: " + Arrays.toString(tab1));
		Arrays.sort(tab1);
		System.out.println("tab1 trié \t: " + Arrays.toString(tab1));
	}

}
