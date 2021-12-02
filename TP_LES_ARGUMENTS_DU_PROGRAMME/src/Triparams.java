import java.util.Arrays;

public class Triparams {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Merci de rentrer au moins un argument");
		}
		
		Arrays.sort(args);
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}