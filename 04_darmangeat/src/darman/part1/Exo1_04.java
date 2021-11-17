package darman.part1;

public class Exo1_04 {

	public static void main(String[] args) {
		 
		 /**
		 A <- 3
		 B <- 10
		 C <- A + B
		 B <- A + B
		 A <- C
		 Fin
		 **/
		
		 int a = 3;
		 int b = 10;
		 int c = a + b;
		 b = a + b;
		 a = c;
		 System.out.println("Valeur de a = " + a);
		 System.out.println("Valeur de b = " + b);
		 System.out.println("Valeur de c = " + c);
	}

}
