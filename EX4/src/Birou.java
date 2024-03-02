
public class Birou {
	private int lungime, latime, inaltime;
 
	private Sertar a,b;
	
	
	
	public Birou(int latime, int lungime, int inaltime, Sertar a, Sertar b) {
	    this.lungime = lungime;
		this.latime = latime;
		this.inaltime = inaltime;
		this.a = a;
		this.b = b;
	}



	public void tipareste() {
		System.out.println("Componentele biroului "+ this.latime+" "+this.lungime+" "+this.inaltime+" sunt:");
		this.a.tipareste();
		this.b.tipareste();
	}
}
