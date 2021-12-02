import java.util.Scanner;

public class Item_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez une phrase : ");
		String str = new String(sc.nextLine());
		System.out.println(str.toUpperCase());
		sc.close();
	}

}
