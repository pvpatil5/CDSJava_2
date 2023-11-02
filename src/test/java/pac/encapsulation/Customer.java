package pac.encapsulation;

public class Customer extends BAnk{

	
	public static void main(String[] args) {
		BAnk b1 = new BAnk();
		System.out.println(b1.getAccountNumber());
		System.out.println(b1.getName());
		System.out.println(b1.getMono());
		System.out.println(b1.getBalance());
		b1.getM1();
	}
}
