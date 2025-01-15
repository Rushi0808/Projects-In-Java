package Client;

import java.util.Scanner;

import Controller.Amozon;
import Controller.ElectronicStore;
import Controller.HelthCare;
import Controller.SellingProduct;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellingProduct SellingProduct = null;

		while (true) {
			System.out.println("***** Wel Come To Product Shoping Manegment System ******");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("\t  1 : Use Amozone Application \n");
			System.out.println("\t  2 : Use HelthCare Application \n");
			System.out.println("\t  3 : Use  Electronic Application \n");
			System.out.println("\t  4 :Exits \n");
			System.out.println("____________________________________________________________________");

			System.out.println("Choice Option");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Wel come to Amozon Application");
				System.out.println("=============================");
				SellingProduct = new Amozon();
				System.out.println("========= menu ===========");
				System.out.println("\t  1 : Shart=400 \n");
				System.out.println("\t  2 : Jeens=1000 \n");
				System.out.println("\t  3 : Shose=600 \n");
				System.out.println("\t  4 : T-shart=300 \n");
				System.out.println("choice option");
				int choice2 = sc.nextInt();
				System.out.println("Enter Product Name");
				String ProductName = sc.next();
				System.out.println("Enter Productprice");
				double productPrice = sc.nextDouble();
				System.out.println("Enter Location");
				String location = sc.next();
				System.out.println("Enter Payment Option");
				String PaymentOption = sc.next();

				SellingProduct.SellProduct(ProductName);
				SellingProduct.productprice(productPrice);
				SellingProduct.Location(location);
				SellingProduct.PaymentOption(PaymentOption);

				break;

			case 2:
				System.out.println("Wel come to HelthCare Application");
				System.out.println("=============================");
				SellingProduct = new HelthCare();
				System.out.println("========= menu ===========");
				System.out.println("\t  1 : Painciller=100 \n");
				System.out.println("\t  2 : Paracetamol=60 \n");
				System.out.println("\t  3 : NA50=80 \n");
				System.out.println("\t  4 : Eno=30 \n");
				System.out.println("choice option");
				int choice3 = sc.nextInt();
				System.out.println("Enter Product Name");
				String ProductName1 = sc.next();
				System.out.println("Enter Productprice");
				double productPrice1 = sc.nextDouble();
				System.out.println("Enter Location");
				String location1 = sc.next();
				System.out.println("Enter Payment Option");
				String PaymentOption1 = sc.next();

				SellingProduct.SellProduct(ProductName1);
				SellingProduct.productprice(productPrice1);
				SellingProduct.Location(location1);
				SellingProduct.PaymentOption(PaymentOption1);

				break;

			case 3:
				System.out.println("Wel come to Electronic Application");
				System.out.println("=============================");
				SellingProduct = new ElectronicStore();
				System.out.println("========= menu ===========");
				System.out.println("\t  1 : Camera=20000 \n");
				System.out.println("\t  2 : Laptop=45000 \n");
				System.out.println("\t  3 : SmartPhone=36000 \n");
				System.out.println("\t  4 : LED=35000 \n");
				System.out.println("choice option");
				int choice4 = sc.nextInt();
				System.out.println("Enter Product Name");
				String ProductName2 = sc.next();
				System.out.println("Enter Productprice");
				double productPrice2 = sc.nextDouble();
				System.out.println("Enter Location");
				String location2 = sc.next();
				System.out.println("Enter Payment Option");
				String PaymentOption2 = sc.next();

				SellingProduct.SellProduct(ProductName2);
				SellingProduct.productprice(productPrice2);
				SellingProduct.Location(location2);
				SellingProduct.PaymentOption(PaymentOption2);

				break;

			case 4:
				System.out.println("=============================");

				System.out.println("Exits");
				System.exit(4);
			}
		}
	}

}
