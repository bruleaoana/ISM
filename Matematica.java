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
TestJenkins/Matematica.java
@zamfiroiu zamfiroiu Add files via upload
f67f158 24 days ago
34 lines (28 sloc)  664 Bytes
  

import java.util.ArrayList;
import java.util.List;

public class Matematica {

	public int suma(int param1, int param2) {
		return param1 + param2;
	}

	public double raport(int numarator, int numitor) {
		if(numitor==0){
			throw new IllegalArgumentException();
		}
		return (double)numarator / numitor;
	}

	public boolean estePar(int numar) {
		return numar % 2 == 0;
	}

	public List<Integer> nNumerePare(int n) {
		if(n==0) {
			return null;
		}
		if(n<0){
			throw new IllegalArgumentException();
		}
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			lista.add(i * 2);
		return lista;
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
