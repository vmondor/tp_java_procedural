
public class Exercice_06 {

	public static void main(String[] args) {
		for(int i = 30; i < 128; i++) {
			System.out.println(String.valueOf(Character.toChars(i)) + "\t" + i + "\t" + Integer.toHexString(i));
		}
	}

}
