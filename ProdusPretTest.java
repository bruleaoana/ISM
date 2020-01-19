import static org.junit.Assert.*;

import org.junit.Test;

public class ProdusPretTest {

	@Test
	public void testSetter() {
		Produs p1 = new Produs("ciocolata", 14, "dulciuri");
		Produs p2=new Produs("lapte", 5, "produse lactate");
		
		p1.setPret(12);
		p2.setPret(6);
		assertEquals("Test setter p1",12,p1.getPret());
		assertEquals("Test setter p2",6,p2.getPret());
	}

}
