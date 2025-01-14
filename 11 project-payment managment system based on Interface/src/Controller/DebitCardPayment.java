package Controller;

public class DebitCardPayment implements Payment {

	@Override
	public void ProcessPayment(double ammount) {
		System.out.println(ammount + " this much amount has been processed successfully by using Debit card payment!!");

		
	}

}
