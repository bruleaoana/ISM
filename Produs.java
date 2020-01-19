
public class Produs {
	public String denumire;
	public int pret;
	public String descriere;
	public Produs(String denumire, int pret, String descriere) {
		super();
		this.denumire = denumire;
		this.pret = pret;
		this.descriere = descriere;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	@Override
	public String toString() {
		return "Produs [denumire=" + denumire + ", pret=" + pret + ", descriere=" + descriere + "]";
	}
	
}
