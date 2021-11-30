import java.util.ArrayList;
import java.util.List;

public class Item3 {

	public static void main(String[] args) {
		long ss = 255067511305279L;
	//	long nir = 97 - ((SS) % 97);
		
		verifieNoSS(ss);

	}
	
	static void verifieNoSS(long noSS) {
		String nombre = Long.toString((long) noSS);
		StringBuffer cle = new StringBuffer();
		for(int i = 13; i < nombre.length(); i++) {
			cle.append(nombre.charAt(i));
		}
		System.out.println(cle);
		
		StringBuffer ss = new StringBuffer();
		for(int i = 0; i < 13; i++) {
			ss.append(nombre.charAt(i));
		}
		System.out.println(ss);
		
		int ssCal = Integer.parseInt(ss.toString());
		int cleCal = Integer.parseInt(cle.toString());
		
		System.out.println(ssCal + " + " + cleCal + " = " + (ssCal+cleCal));
	}

}
