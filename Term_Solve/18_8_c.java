import java.util.*;
class Product implements Comparable<Product>{
	private String name;
	private double price;
	Product (String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName () {
		return this.name;
	}
	public double getPrice () {
		return this.price;
	}

	@Override
	public int compareTo(Product p){
		return this.name.compareTo(p.name);
	}

	public static void main(String[] args){
		ArrayList<Product> myProducts = new ArrayList<>();
		myProducts.add(new Product("Dihan",100));
	}
}

