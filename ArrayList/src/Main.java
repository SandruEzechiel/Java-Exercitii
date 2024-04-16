import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		System.out.println(swapFirstLast(list));
	}
	public static ArrayList<String> swapFirstLast(ArrayList<String> list) {
		if(list.size()>= 2) {
			String auxFirst = list.get(list.size()-1);
			String auxLast = list.get(0);
			list.set(0,auxFirst);
			list.set(list.size()-1, auxLast );
			return list;
		}
		return list;
	}
}