public class testCosCumparaturi {

	public static void main(String[] args) {
		CosCumparaturi shopping_cart = new CosCumparaturi();
		Produs p1 = new Produs("Samsung S24", 3199.99);
		Produs p2 = new Produs("Oreo", 9.99);
		Produs p3 = new Produs("Masina cu telecomanda", 300.03);
		shopping_cart.addProduct(p1);
		shopping_cart.addProduct(p2);
		shopping_cart.addProduct(p3);
		System.out.println(shopping_cart);
	}

}