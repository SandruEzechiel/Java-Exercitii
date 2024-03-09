import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
	     System.out.println("Introduceti primul numaru: ");
	     int a= x.nextInt();
	     System.out.println("Introduceti al doilea numaru: ");
	     int b=x.nextInt();
	     
	     if (a%2==0 && b%2==0)
	     {
	    	 System.out.println((a+b)/2);
	     }
	     else 
	     {
	    	 if(a%2!=0 && b%2!=0)
	    		 System.out.println(a*b);
	    	 else
	    		 if(a%2!=0 || b%2!=0) 
	    	    	 System.out.println(a+b);
	     }
	     
	     
	     
	     
	     
	     
	}

}
