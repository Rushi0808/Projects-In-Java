package Productmanagmentsystem;

public class Product {
	
	    private int productId;
	    private String productName;
	    private double productPrice;
	    private int productQty;
	    private String productType; 

	   
	    public void setProductId(int productId) {
			this.productId = productId;
		}


		public void setProductName(String productName) {
			this.productName = productName;
		}


		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}


		public void setProductQty(int productQty) {
			this.productQty = productQty;
		}


		public void setProductType(String productType) {
			this.productType = productType;
		}


		public Product(int productId, String productName, double productPrice, int productQty, String productType) {
	        this.productId = productId;
	        this.productName = productName;
	        this.productPrice = productPrice;
	        this.productQty = productQty;
	        this.productType = productType;
	    }

	   
	    public int getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public double getProductPrice() {
	        return productPrice;
	    }

	    public int getProductQty() {
	        return productQty;
	    }

	    public String getProductType() {
	        return productType;
	    }

	    
	    public String toString() {
	        return "Product ID: " + productId + ", Name: " + productName + ", Price: " + productPrice + 
	               ", Quantity: " + productQty + ", Type: " + productType;
	    }


		public void displayProduct() {
			
			
		}


		public void displayProduct1() {
			
			
		}
	}


