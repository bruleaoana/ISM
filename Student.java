
public class Student {
	public String nume;
	public int nota;
	public String facultate;
	
	public Student(String nume, String facultate, int nota) {
		super();
		this.nume = nume;
		this.nota = nota;
		this.facultate = facultate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	@Override
	public String toString() {
		return "Student [nume=" + nume + ", nota=" + nota + ", facultate=" + facultate + "]";
	}
	
}
