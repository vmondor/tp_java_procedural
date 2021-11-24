import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une somme en euro : ");
		float euro = sc.nextFloat();
		float dollars =  (float) (euro / 0.719514);
		System.out.println(euro + "€" + " = " + dollars + "$");
		sc.close();
	}

}
