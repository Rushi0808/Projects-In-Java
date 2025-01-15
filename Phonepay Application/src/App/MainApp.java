package App;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phonepay[] app = new Phonepay[10];
		int index = 0;
		app[index++] = new Phonepay(9876532186l, 9325456048l, "rushi jadhav", 1000);
		app[index++] = new Phonepay(3456432186l, 87655555548l, "raj patil", 6000);
		app[index++] = new Phonepay(45365432186l, 9090545604l, "om kale", 4000);

		while (true) {

			System.out.println("-------Wel Come To PhonePay Application--------");
			System.out.println("-------------------------------------------------");

			System.out.println("\t 1:  Phone Pay  Account Create \n");
			System.out.println("\t 2 :Display User Details  \n");
			System.out.println("\t 3: Payment Transfer by use moboile number \n");
			System.out.println("\t 4: check balence by MoboileNumber \n");
			System.out.println("\t 5:Exiting Application Goodbye !\n");

			System.out.println("===================================================");

			System.out.println("choice Option");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Wel come to PhonePay Application");
				System.out.println("=============================");

				System.out.println("Enter Moboile Number");
				long AccountNumber = sc.nextLong();
				System.out.println("Enter Account Number");
				long mobaileNumber = sc.nextLong();
				System.out.println("Enter Custemer Name");
				String name = sc.next();
				System.out.println("Enter add balence");
				double balence = sc.nextDouble();

				app[index++] = new Phonepay(AccountNumber, mobaileNumber, name, balence);

				System.out.println("Account Created Succsesfull Done !!!");
				break;

			case 2:
				System.out.println("=========== Display User Details ============");
				for (Phonepay aa : app) {
					if (aa != null) {
						System.out.println(" Account Number :" + aa.getAccountNumber());
						System.out.println(" Moboile Number :" + aa.getMobaileNumber());
						System.out.println(" Custemer Name :" + aa.getName());
						System.out.println(" Balence :" + aa.getBalence());
						System.out.println("--------------------------------------------");

					}
				}
				break;
			case 3:
				System.out.println("Enter Mobile Number to Transfer Money:");
				long MoboileNumber = sc.nextLong();
				System.out.println("Enter Ammount to Transfer");
				Double Ammount = sc.nextDouble();
				boolean found = false;
				for (int i = 0; i < index; i++) {
					if (app[i].getMobaileNumber() == MoboileNumber) {
						if (app[i].getBalence() >= Ammount) {
							app[i].setBalence(app[i].getBalence() - Ammount);
							System.out.println("Transfer Successful! Available Balance: " + app[i].getBalence());

						} else {
							System.out.println("Insufficient Balance");
						}
						found = true;
						break;

					}
				}
				if (!found) {
					System.out.println("mobile number not found");
				}
				break;
			case 4:
				System.out.println("Check balence by Moboile Number");
				long targetMobaileNumber = sc.nextLong();

				found = false;
				for (Phonepay aa : app) {
					if (aa.getMobaileNumber() == targetMobaileNumber) {
						System.out.println("Account Balance: " + aa.getBalence());
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("moboile number is Not Found!");
				}
				break;

			case 5:
				System.out.println("Exiting Application Goodbye !");
				System.out.println("----Thanks for Use Application-----");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice ! Please try again");
			}
		}

	}
}
