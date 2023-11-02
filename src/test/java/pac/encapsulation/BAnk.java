package pac.encapsulation;

public class BAnk 
{

	private final String name= "Ram";
	private	String mono ="9876543210";
	private	double balance = 120.02;
	private	final long accountNumber=5554477889999l;
	private	String address="Pune";
	
	public String getName() {
		return name;
	}
	public String getMono() {
		return mono;
	}
	public double getBalance() {
		return balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private void m1() {
		System.out.println("This is pvt method");
	}
	
	public void getM1() {
		m1();
	}

}
