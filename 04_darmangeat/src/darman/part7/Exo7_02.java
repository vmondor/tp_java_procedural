package darman.part7;

public class Exo7_02 {

	public static void main(String[] args) {
		int posmaxi = 0, temp = 0;
		int [] tableau = new int [] {1, 3, 8, 5, 6, 4, 2};
		
		for(int i = 0; i < tableau.length; i++) {
		  posmaxi = i;
		  
		  for(int j = i + 1; j < tableau.length; j++) {
		    if(tableau[j] > tableau[posmaxi]) {
		      posmaxi = j;
		    }
		  }
		  
		  temp = tableau[posmaxi];
		  tableau[posmaxi] = tableau[i];
		  tableau[i] = temp;
		  System.out.println("for : " + tableau[i]);
		}
		
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = 0; i < tableau.length -1; i++) {
				if(tableau[i] < tableau[i + 1]) {
					temp = tableau[i];
					tableau[i] = tableau[i+1];
					tableau[i + 1] = temp;
					flag = true;
				}
			}
			for(int value : tableau) {
				System.out.println("while : " + value);
			}
		}
	}

}

