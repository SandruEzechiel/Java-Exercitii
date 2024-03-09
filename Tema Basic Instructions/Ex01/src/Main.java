import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
     System.out.println("Introduceti numarul: ");
     int nota= x.nextInt();
     if(nota>=1 & nota<=10) {
    	 if(nota<5)
    		 System.out.println("RESPINS");
    	 else System.out.println("ADMIS");
     }
     else System.out.println("INVALID");
    	 
	}

}
