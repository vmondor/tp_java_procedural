import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le premier chiffre : ");
		int number1 = sc.nextInt();
		System.out.print("Entrez le deuxième chiffre : ");
		int number2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Choisissez l'opérateur (+, -, /, *) : ");
		char operateur = sc.next().charAt(0);
		
		if(operateur == '+') {
			result = number1 + number2;
		}
		else if(operateur == '-') {
			result = number1 - number2;
		}
		else if(operateur == '/') {
			result = number1 / number2;
		}
		else if(operateur == '*') {
			result = number1 * number2;
		}
		else {
			System.out.println("Opérateur incorrect");
		}
		System.out.println(number1 + " " + operateur + " " + number2 + " = " + result);
		sc.close();

	}

}
