package Controller;

public class CreditCardPayment implements Payment {

	@Override
	public void ProcessPayment(double ammount) {
		System.out.println(ammount + " this much amount has been processed successfully by using credit card payment!!");

	}

}
