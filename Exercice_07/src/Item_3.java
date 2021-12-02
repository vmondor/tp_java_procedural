import java.util.Scanner;

public class Item_3 {
	
	public static final float PI = 3.14f;

	public static void main(String[] args) {
//		(rayon x rayon) x pi = aire
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le diametre du cercle : ");
		float diametre = sc.nextFloat();
		float rayon = diametre / 2;
		float surface = (rayon * rayon) * PI;
		System.out.println("La surface est de : " + surface + " cm²");
		sc.close();
		
	}

}
