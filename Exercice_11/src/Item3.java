

public class Item3 {

	public static void main(String[] args) {
		long ss = 255067511305279L;
		
		
		if(verifieNoSS(ss)) {
			System.out.println("Valide");
		}
		else {
			System.out.println("Invalide");
		}

	}
	
	static boolean verifieNoSS(long noSS) {
		String nombre = Long.toString((long) noSS);
		StringBuffer cle = new StringBuffer();
		for(int i = 13; i < nombre.length(); i++) {
			cle.append(nombre.charAt(i));
		}
		
		StringBuffer ss = new StringBuffer();
		for(int i = 0; i < 13; i++) {
			ss.append(nombre.charAt(i));
		}
		
		String ssString = ss.toString();
		long ssLong = Long.parseLong(ssString);
		long nir = 97 - ((ssLong) % 97);
		String cleString = cle.toString();
		long cleLong = Long.parseLong(cleString);
		if(nir == cleLong) {
			return true;
		}
		else {
			return false;
		}
	}

}
