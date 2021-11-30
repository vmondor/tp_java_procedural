import java.util.Scanner;

public class Item_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez une chaine de caractère : ");
		String cle = "abcdefghijklmnopqrstuvwxyz ?./'!-ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String msg = sc.nextLine();
		System.out.print("Entrez un nombre : ");
		int pass = sc.nextInt();
		
		System.out.println("Message clair \t\t: " + msg);

		System.out.println("Message crypté \t\t: " + cryptage(msg, cle, pass));
		StringBuffer msgcrypt = cryptage(msg, cle, pass);
		System.out.println("Message décrypté \t: " + decryptage(msgcrypt, cle, pass));
		sc.close();
		
	}

	public static StringBuffer cryptage(String msg, String cle, int pass) {
		int value;
		StringBuffer msgCrypt = new StringBuffer();
		for (int i = 0; i < msg.length(); i++) {
			for (int j = 0; j < cle.length(); j++) {
				if (msg.charAt(i) == cle.charAt(j)) {
					value = j + pass;
					if (value >= cle.length()) {
						value = (j + pass) - cle.length();
					}
					msgCrypt.append(cle.charAt(value));
				}
			}
		}
		return msgCrypt;
	}
	
	public static String decryptage(StringBuffer msgCrypt, String cle, int pass) {
		int value;
		StringBuffer msg = new StringBuffer();
		for (int i = 0; i < msgCrypt.length(); i++) {
			for (int j = 0; j < cle.length(); j++) {
				if (msgCrypt.charAt(i) == cle.charAt(j)) {
					value = j - pass;
					if (value < 0) {
						value = value + cle.length();
					}
					msg.append(cle.charAt(value));
				}
			}
		}
		String message = msg.toString();
		return message;
	}

}
