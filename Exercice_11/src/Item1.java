import java.text.DecimalFormat;

public class Item1 {

	public static void main(String[] args) {
		float euro = 10;
		float franc = 1;
		float num1 = (float) 23.54;
		float num2 = (float) 46.12;
		convertEuroLivre(euro);
		convertFranclivre(franc);
		arrondi(num1, num2);
		troncature(num1, num2);

	}
	
	static void convertEuroLivre(float euro) {
		System.out.println(euro + " euro \t= " + (euro * 0.85) + " livre Sterling");
	}
	
	static void convertFranclivre(float franc) {
		System.out.println(franc + " Franc \t= " + (franc * 0.81) + " livre Sterling");
	}
	
	static void arrondi(float num1, float num2) {
		DecimalFormat df = new DecimalFormat("#");
		float result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " \t= " + df.format(result));
	}
	
	static void troncature(float num1, float num2) {
		DecimalFormat df = new DecimalFormat("#.#");
		float result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " \t= " + df.format(result));
	}
}
