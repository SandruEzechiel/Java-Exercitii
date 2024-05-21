public class Main {
	public static void main(String[] args) {
		Joc joc1 = new Joc("ROU","HUN");
		Joc joc2 = new Joc("ENG","GER");
		
		joc1.simuleaza();
		joc2.simuleaza();
		System.out.println(joc1);
		System.out.println(joc2);
	}
}