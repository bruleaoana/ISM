Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@bruleaoana 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


zamfiroiu
/
TestJenkins
1
00
 Code Issues 0 Pull requests 0 Actions Projects 0 Wiki Security Insights
TestJenkins/MatematicaTests.java
@zamfiroiu zamfiroiu Add files via upload
de23c02 6 days ago
84 lines (69 sloc)  1.75 KB
  
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class MatematicaTests {
	Matematica mate;
	
	@Before
	public void setUp(){
		mate=new Matematica();
	}
	
	@Test
	public void testSumaCorectitudine() {
		int rezultat=mate.suma(3, 12);
		int rezultatAsteptat=15;
		assertEquals(rezultatAsteptat, rezultat);
	}
	
	@Test
	public void testRaportCorect(){

		double rezultat=mate.raport(12, 3);
		double rezultatAsteptat=4;
		assertEquals(rezultatAsteptat, rezultat,0.1);
	}
	
	@Test
	public void testRaportExceptie(){
		try{
			mate.raport(34, 0);
			fail("Metoda nu arunca exceptie");
		}catch(IllegalArgumentException er){
			
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRaportExceptieJUnit4(){
		mate.raport(45, 0);
	}
	
	@Test
	public void testRaportVirgulaMobila(){
		double rezultat=mate.raport(15, 4);
		double rezultatAsteptat=3.75;
		assertEquals(rezultatAsteptat, rezultat,0.1);
	}
	
	@Test
	public void testEsteParCorect(){
		assertTrue(mate.estePar(8));
		assertFalse(mate.estePar(9));
		assertFalse(mate.estePar(-9));
	}
	
	@Test
	public void testNNumerePareCorect(){
		List<Integer> lista=mate.nNumerePare(8);
		for(Integer element:lista){
			assertTrue(mate.estePar(element));
		}
	}
	
	@Test
	public void testNNumerePareDimensiune(){
		int nrElemente=8;
		List<Integer> lista=mate.nNumerePare(nrElemente);
		assertEquals(nrElemente, lista.size());
	}
	
	@Test
	public void testNNumerePareNULL(){
		List<Integer> lista=mate.nNumerePare(0);
		assertNull(lista);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNNumerePareNumarNegativ(){
		List<Integer> lista=mate.nNumerePare(-2);

	}
}
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
