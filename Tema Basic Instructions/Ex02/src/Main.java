import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
	     System.out.println("Introduceti numarul: ");
	     int nr= x.nextInt();
	    
	     switch (nr)
	     {
	     case 1: System.out.println("UNU");
	     break;
	     case 2: System.out.println("DOI");
	     break;
	     case 3: System.out.println("TREI");
	     break;
	     case 4: System.out.println("PATRU");
	     break;
	     case 5: System.out.println("CINCI");
	     break;
	     default: System.out.println("INVALID");
	     break;
	     }
	     
	     

	}

}
