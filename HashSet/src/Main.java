import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashSet<String> hSet = new HashSet<String>();
		int n=input.nextInt();
      

		
		for(int i = n + 1; i > 0; i--) {
			
			String line = new String(input.nextLine());
			String[] stringArray=line.split(" ");
			hSet.add(stringArray[stringArray.length-1]);
			System.out.println(hSet.size()-1);
		} 
		
		input.close();
		
	}

}