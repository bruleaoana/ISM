import static org.junit.Assert.*;

import org.junit.Test;

public class StudentFacultateTest {

	@Test
	public void test1(){
		Student s1=new Student("Oana","CSIE",9);
		Student s2=new Student("Popescu","CIG",10);
		
		assertEquals("S1 este student CSIE","CSIE", s1.getFacultate());
		assertEquals("S1 este student CIG","CIG", s2.getFacultate());
	}
	
}
