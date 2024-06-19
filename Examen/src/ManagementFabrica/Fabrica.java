package ManagementFabrica;

import java.util.ArrayList;

import Persoane.JobFabrica;
import Persoane.Client;
import ManagementFabrica.Act;

public class Fabrica {
	private ArrayList<JobFabrica> angajati;
	private ArrayList<Client> clienti;
	private ArrayList<Act> acte;
	
	public Fabrica {
		
		this.angajati = new ArrayList<JobFabrica>();
		this.clienti = new ArrayList<Client>();
		this.acte = new ArrayList<Act>();
	}
	public void AdaugaJobFabrica(JobFabrica x) {
	this.angajati.add(x);}
	
	public void ConcediereJobFabrica(JobFabrica x) {
		this.angajati.remove(x);}
		
	
	
}