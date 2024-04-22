import java.util.LinkedList;

public class CosCumparaturi {
	private LinkedList<Produs> products = new LinkedList<Produs>();
	
	public CosCumparaturi(LinkedList<Produs> products) {
		this.products = products;
	}
	
	public CosCumparaturi() {
		this.products = new LinkedList<Produs>();
	}

	public void addProduct(Produs added_product) {
		this.products.add(added_product);
	}
	
	public double calculateTotal() {
		double totalPrice = 0.0;
		for(Produs product : products) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}
	
	@Override
	public String toString() {
		String shopping_cart = "Produsele din cosul tau de cumparaturi:"+System.lineSeparator();
		Integer index = 1;
		for(Produs product : products) {
			shopping_cart += "[" + Integer.toString(index)+"] " + product+System.lineSeparator();
			index++;
		}
		shopping_cart += "Pret total: " + String.format("%.02f",calculateTotal()) + " RON";
		return shopping_cart;
	}
}