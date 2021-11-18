package darman.part4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Exo4_07Test {

	@Test
	void contratTest() {
		Exo4_07 testContrat = new Exo4_07();
		String contrat1 = testContrat.contrat(21, 1, 0, 0);
		String contrat2 = testContrat.contrat(21, 1, 1, 0);
		assertEquals("rouge", contrat1);
		assertEquals("refusé", contrat2);
		
		String contrat3 = testContrat.contrat(21, 4, 0, 0);
		String contrat4 = testContrat.contrat(40, 1, 0, 0);
		assertEquals("orange", contrat3);
		assertEquals("orange", contrat4);
		String contrat5 = testContrat.contrat(21, 4, 1, 0);
		String contrat6 = testContrat.contrat(40, 1, 1, 0);
		assertEquals("rouge", contrat5);
		assertEquals("rouge", contrat6);
		String contrat7 = testContrat.contrat(21, 4, 2, 0);
		String contrat8 = testContrat.contrat(40, 1, 2, 0);
		assertEquals("refusé", contrat7);
		assertEquals("refusé", contrat8);
		
		String contrat9 = testContrat.contrat(50, 4, 0, 0);
		String contrat10 = testContrat.contrat(50, 4, 1, 0);
		String contrat11 = testContrat.contrat(50, 4, 2, 0);
		String contrat12 = testContrat.contrat(50, 4, 3, 0);
		assertEquals("vert", contrat9);
		assertEquals("orange", contrat10);
		assertEquals("rouge", contrat11);
		assertEquals("refusé", contrat12);
		
		
		//assertEquals("refusé", contrat2);
		// age, permis, accident, assurance
	}
}
