import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;

import static fr.afpa.math.Math.factorielle;
import static fr.afpa.math.Math.factorielleBig;

class MathTest {

	@Test
	public void testFactorielleZero() {
		assertEquals(factorielle(0), 1, "La factorielle de zero vaut 1");
	}
	@Test
	public void testFactorielleUn() {
		assertEquals(factorielle(1), 1, "La factorielle de 1 vaut 1");
	}
	@Test
	public void testFactorielleTrois() {
		assertEquals(factorielle(3), 6, "La factorielle de zero vaut 1");
	}
	@Test public void testFactorielleVingtUn() {
		assertThrows(IllegalArgumentException.class,
				() -> {factorielle(21);},"La factorielle de 21 ne peut pas �tre calcul�e");
	}
	@Test public void testFactorielleMoinsUn() {
		assertThrows(StackOverflowError.class,
				() -> {factorielle(-1);}, "La factorielle de -1 ne peut pas �tre calcul�e");
	}
	@Test public void testFactorielleQuaranteCinq() {
		assertThrows(IllegalArgumentException.class,
				() -> {factorielle(45);}, "La factorielle de 45 ne peut pas �tre calcul�e");
	}
	@Test
	public void testFactorielleBigZero() {
		assertEquals(factorielleBig(new BigInteger("0")), new BigInteger("1"), "La factorielle de zero vaut 1");
	}
	@Test
	public void testFactorielleBigUn() {
		assertEquals(factorielleBig(new BigInteger("1")), new BigInteger("1"), "La factorielle de un vaut 1");
	}
	@Test
	public void testFactorielleBigTrois() {
		assertEquals(factorielleBig(new BigInteger("3")), new BigInteger("6"), "La factorielle de trois vaut 6");
	}
	@Test
	public void testFactorielleBigTVingt() {
		assertEquals(factorielleBig(new BigInteger("20")), new BigInteger("2432902008176640000"), "La factorielle de trois vaut 6");
	}
	@Test
	public void testFactorielleBigTVingtUn() {
		assertEquals(factorielleBig(new BigInteger("21")), new BigInteger("51090942171709440000"), "La factorielle de trois vaut 6");
	}
	@Test public void testFactorielleBigMoinsUn() {
		assertThrows(StackOverflowError.class,
				() -> {factorielleBig(new BigInteger("-1"));}, "La factorielle ne peut pas être calculé");
	}
	@Test
	public void testFactorielleBigTQuaranteCinq() {
		assertEquals(factorielleBig(new BigInteger("45")), new BigInteger("119622220865480194561963161495657715064383733760000000000"), "La factorielle de trois vaut 6");
	}

}
