package Controller;

public class Product extends Item {
	int productid;
	int prodQty;

	public Product(String name, double price, int productid ,int prodQty) {
		super(name, price);
		this.productid = productid;
	}

	public int getProductid() {
		return productid;
	}

	public int getProdQty() {
		return prodQty;
	}

	@Override
	public String toString() {
		return "Product [ name=" + name + ", productid=" + productid + ", prodQty=" + prodQty + ", price=" + price + "]";
	}

	

	

	

	
}
