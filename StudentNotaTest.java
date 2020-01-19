import static org.junit.Assert.*;

import org.junit.Test;

public class StudentNotaTest {

	@Test
	public void test2(){
		Student s1=new Student("Oana","ISM",9);
		Student s2=new Student("Popescu","CSIE",10);
		
		assertTrue("Studentul s1 a promovat examenul", s1.getNota()>5);
		assertTrue("Studentul s2 a promovat examenul", s2.getNota()>5);
	}

}
