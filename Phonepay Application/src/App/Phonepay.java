package App;

public class Phonepay {

	private long AccountNumber;
	private long mobaileNumber;
	private String name;
	private double balence;

	public Phonepay(long accountNumber, long mobaileNumber, String name, double balence) {
		super();
		AccountNumber = accountNumber;
		this.mobaileNumber = mobaileNumber;
		this.name = name;
		this.balence = balence;

	}

	public long getAccountNumber() {
		return AccountNumber;
	}

	public long getMobaileNumber() {
		return mobaileNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalence() {
		return balence;
	}

	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}

	public void setMobaileNumber(long mobaileNumber) {
		this.mobaileNumber = mobaileNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}
}
	 
	


