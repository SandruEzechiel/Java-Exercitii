import java.util.Scanner;

public class Main {

	
		public static void main(String[] args) {
			Scanner x=new Scanner(System.in);
			System.out.println("Introduceti primul numaru: ");
		    int a=x.nextInt();
		     int min=a;
		     System.out.println("Introduceti al doilea numaru: ");
		     a=x.nextInt();
		     if(a<min) min=a;
		     System.out.println("Introduceti al treilea numar: ");
		     a=x.nextInt();
             if(a<min) min=a;
             System.out.println("Minimul este: "+min);
	}

}
