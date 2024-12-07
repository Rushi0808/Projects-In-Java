package Productmanagmentsystem;

import java.util.Scanner;

public class Productmaneger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] products = new Product[10];
		int index = 0;

		products[index++] = new Product(11, "redmi", 200, 1, "mobaile");
		products[index++] = new Product(12, "dell", 5000, 5, "laptop");
		products[index++] = new Product(13, "i phone", 7000, 5, "mac");

		while (true) {
			System.out.println("\n1) Add new Product");
			System.out.println("2) Display All products");
			System.out.println("3) Find Product By Name");
			System.out.println("4) Filter Products With Price Less Than 500");
			System.out.println("5) Filter Products With Price More Than 1000");
			System.out.println("6) Find Product by Type");
			System.out.println("7) Find Product by ID");
			System.out.println("8) Filter Products With Quantity Less Than 2");
			System.out.println("9) Exit");
			System.out.println("----------------------------------------------------------------------");

			System.out.print("Choose an option: ");

			int choice = sc.nextInt();

			if (choice == 1) {
			
				System.out.println("enter your product id ");
				int idcheck=sc.nextInt();
				boolean idexists=false;
				
				for(int i=0;i<products.length;i++)
				{
					if(products[i]!=null)
					{
						if(products[i].getProductId()==idcheck)
						{
							idexists=true;
							System.out.println("ID Already Exists");
							break;
						}
					}
				}
				
				if(!idexists)
				{
					System.out.println("Enter Product details like-> name,price,qty,type");
					if(index<products.length)
					{
						products[index++] = new Product(idcheck, sc.next(), sc.nextDouble(), sc.nextInt(), sc.next());
						System.out.println("product added succsesfully");

					}
					else
					{
						System.out.println("Array is Full, cannot add new product");
					}
				}
				
				
				
				

			} else if (choice == 2) {
				for (Product aa : products) {
					if (aa != null) {
						System.out.println("enter product id :" + aa.getProductId());
						System.out.println("enter product name :" + aa.getProductName());
						System.out.println("enter product price :" + aa.getProductPrice());
						System.out.println("enter product qty :" + aa.getProductQty());
						System.out.println("enter product type :" + aa.getProductType());
						System.out.println("--------------------------------------------------------------");
					}
				}
			} else if (choice == 3) {
				System.out.println("find product by product name");
				String producname = sc.next();
				boolean found = true;
				System.out.println("enter product name");
				for (Product aa : products) {
					if (aa != null && aa.getProductName().equalsIgnoreCase(producname)) {
						System.out.println("enter product id :" + aa.getProductId());
						System.out.println("enter product name :" + aa.getProductName());
						System.out.println("enter product price :" + aa.getProductPrice());
						System.out.println("enter product qty :" + aa.getProductQty());
						System.out.println("enter product type :" + aa.getProductType());
						System.out.println("--------------------------------------------------------------");

					}
				}
				if (!found)
					System.out.println("product no not found");
				
				
			} else if (choice == 4) {
				System.out.println("product with price less than 500");
				for (Product aa : products) {
					if (aa != null && aa.getProductPrice() < 500) {
						System.out.println("enter product id :" + aa.getProductId());
						System.out.println("enter product name :" + aa.getProductName());
						System.out.println("enter product price :" + aa.getProductPrice());
						System.out.println("enter product qty :" + aa.getProductQty());
						System.out.println("enter product type :" + aa.getProductType());
						System.out.println("--------------------------------------------------------------");

					}
				}
			}

			else if (choice == 5) {
				System.out.println("Filter Products With Price More Than 1000");
				for (Product a : products) {
					if (a != null && a.getProductPrice() > 1000) {
						System.out.println("enter product id :" + a.getProductId());
						System.out.println("enter product name :" + a.getProductName());
						System.out.println("enter product price :" + a.getProductPrice());
						System.out.println("enter product qty :" + a.getProductQty());
						System.out.println("enter product type :" + a.getProductType());
						System.out.println("--------------------------------------------------------------");

					}
				}
			} else if (choice == 6) {
				System.out.println("Find Product by Type");
				String productype = sc.next();
				boolean found = true;
				System.out.println("enter product type");
				for (Product aa : products) {
					if (aa != null && aa.getProductType().equalsIgnoreCase(productype)) {
						System.out.println("enter product id :" + aa.getProductId());
						System.out.println("enter product name :" + aa.getProductName());
						System.out.println("enter product price :" + aa.getProductPrice());
						System.out.println("enter product qty :" + aa.getProductQty());
						System.out.println("enter product type :" + aa.getProductType());
						System.out.println("--------------------------------------------------------------");

					}
				}
				if (!found)
					System.out.println("product type not found");
			}

			else if (choice == 7) {
				System.out.println("Find Product by ID");
				int productId = sc.nextInt();
				System.out.println("enter product id");
				boolean found = true;
				for (Product aa : products) {
					if (aa != null && aa.getProductId() == productId) {
						System.out.println("enter product id :" + aa.getProductId());
						System.out.println("enter product name :" + aa.getProductName());
						System.out.println("enter product price :" + aa.getProductPrice());
						System.out.println("enter product qty :" + aa.getProductQty());
						System.out.println("enter product type :" + aa.getProductType());
						System.out.println("--------------------------------------------------------------");

					}
					
				if(!found)
						System.err.println("Id not found");
				
						
					}
			}
				else if (choice == 8) {
					System.out.println("Filter Product with quantity less than 2");
					for (Product aa : products) {
						if (aa != null && aa.getProductQty() < 2) {
							System.out.println("enter product id :" + aa.getProductId());
							System.out.println("enter product name :" + aa.getProductName());
							System.out.println("enter product price :" + aa.getProductPrice());
							System.out.println("enter product qty :" + aa.getProductQty());
							System.out.println("enter product type :" + aa.getProductType());
							System.out.println("--------------------------------------------------------------");
							
				}
					
						}
							
						
			}
		}
	}
}
