import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RepertoireTel {

	public static void main(String[] args) {
		HashMap<String, String> repertoire = new HashMap<>();
		repertoire.put("Paul", "0156873421");
		repertoire.put("Moham", "097845328654");
		repertoire.put("Gunter", "0745632189");
		System.out.println(repertoire);
		List<String> repertoireByKey = new ArrayList<>(repertoire.keySet());
		Collections.sort(repertoireByKey);
	}

}
