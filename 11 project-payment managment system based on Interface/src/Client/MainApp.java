package Client;

import java.util.Scanner;

import Controller.CreditCardPayment;
import Controller.DebitCardPayment;
import Controller.Payment;
import Controller.UPIPayment;

public class MainApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Payment payment = null;

		while (true) {
			System.out.println("Menu");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("\t  1 :Pay using Credit card \n");
			System.out.println("\t  2 :Pay using Debit card \n");
			System.out.println("\t  3 :pay using UPI \n");
			System.out.println("\t  4 :Exits \n");
			System.out.println("____________________________________________________________________");

			System.out.println("Choice Option");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				try {
					System.out.println("Wel come to Credit Card Payment");
					System.out.println("=============================");
					payment = new CreditCardPayment();
					System.out.println("Enter ammount");
					double ammount = sc.nextDouble();
					if (ammount < 0) {
						throw new NegetiveInputException();
					} else {
						payment.ProcessPayment(ammount);

					}
				} catch (NegetiveInputException e) {
					e.printStackTrace();
				}

				break;

			case 2:
				try {
					System.out.println("Wel come to Debit Card Payment");
					System.out.println("=============================");

					payment = new DebitCardPayment();
					System.out.println("Enter ammount");
					double ammount1 = sc.nextDouble();
					if (ammount1 < 0) {
						throw new NegetiveInputException();
					} else {
						payment.ProcessPayment(ammount1);

					}

				} catch (NegetiveInputException e) {
					e.printStackTrace();
				}
				break;

			case 3:

				try {
					System.out.println("Wel come to UPI Payment");
					System.out.println("=============================");

					payment = new UPIPayment();
					System.out.println("Enter ammount");
					double ammount2 = sc.nextDouble();

					if (ammount2 < 0) {
						throw new NegetiveInputException();
					} else {
						payment.ProcessPayment(ammount2);
					}
				} catch (NegetiveInputException e) {
					e.printStackTrace();
				}
				break;

			case 4:
				System.out.println("=============================");

				System.out.println("Exits");
				System.exit(4);

			}
		}
	}

}
