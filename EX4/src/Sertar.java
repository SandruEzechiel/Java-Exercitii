
public class Sertar {
	private int latime, lungime, inaltime;

	public Sertar(int latime, int lungime, int inaltime) {
		this.latime = latime;
		this.lungime = lungime;
		this.inaltime = inaltime;
	}
	public void tipareste() {
		System.out.println("Sertar " +this.latime+" "+this.lungime+" "+this.inaltime);
	}
	public int getLatime() {
		return latime;
	}
	public int getLungime() {
		return lungime;
	}
	public int getInaltime() {
		return inaltime;
	}
	
}
