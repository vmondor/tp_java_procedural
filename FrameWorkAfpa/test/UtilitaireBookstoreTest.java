import static org.junit.jupiter.api.Assertions.*;

import fr.afpa.outil.UtilitaireBookstore;
import java.time.LocalDate;


import org.junit.jupiter.api.Test;

class UtilitaireBookstoreTest {

	@Test
	void isPretEnRetardTrue() {
		assertTrue(UtilitaireBookstore.isPretEnRetard(LocalDate.now().minusDays(10), LocalDate.now(), 15), "Le pret est rendu avant la date limite");
	}
	@Test
	void isPretEnRetardFalse() {
		assertFalse(UtilitaireBookstore.isPretEnRetard(LocalDate.now().minusDays(20), LocalDate.now(), 15), "Le pret est rendu apres la date limite");
	}
	@Test
	void getAgeVingtUn() {
		assertEquals(UtilitaireBookstore.getAge(LocalDate.parse("2000-05-05"), LocalDate.now()), 21, "L'age doit etre egal a 20");
	}
	@Test
	void getAgeMoinsUn() {
		assertEquals(UtilitaireBookstore.getAge(LocalDate.parse("2050-05-05"), LocalDate.now()), -28, "L'age doit retourner un nombre negatif");
	}
}
