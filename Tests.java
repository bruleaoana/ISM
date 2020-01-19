import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void test1(){
		Student s1=new Student("Oana","CSIE",9);
		Student s2=new Student("Popescu","CIG",10);
		
		assertEquals("S1 este student CSIE","CSIE", s1.getFacultate());
		assertEquals("S1 este student CIG","CIG", s2.getFacultate());
	}
	
	@Test
	public void test2(){
		Student s1=new Student("Oana","ISM",9);
		Student s2=new Student("Popescu","CSIE",10);
		
		assertTrue("Studentul s1 a promovat examenul", s1.getNota()>5);
		assertTrue("Studentul s2 a promovat examenul", s2.getNota()>5);
	}

}
