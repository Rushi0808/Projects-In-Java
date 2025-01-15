package Controller;

public class HelthCare implements SellingProduct {

	@Override
	public void SellProduct(String ProductName) {
		System.out.println(ProductName );

	}

	@Override
	public void productprice(double productPrice) {
		System.out.println(productPrice);
	}

	@Override
	public void Location(String Location) {
		System.out.println(Location);
		
	}
	@Override
	public void PaymentOption(String Payment) {

		System.out.println("UPI Payment is  Sucessfully Done !!!");
		System.out.println(": this much Products has been processed successfully Book by using HelthCare Application!!");
	}

}
