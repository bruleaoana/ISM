import static org.junit.Assert.*;

import org.junit.Test;

public class ProdusDenumireTest {

	@Test
	public void testDenumire() {
		Produs p1 = new Produs("ciocolata", 14, "dulciuri");
		Produs p2=new Produs("lapte", 5, "produse lactate");
		
		assertEquals("ciocolata", p1.getDenumire());
		assertEquals("lapte", p2.getDenumire());
	}

}
