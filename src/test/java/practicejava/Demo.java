package practicejava;

public class Demo {


	String name="pune";
	int a1=30;
	
	static String state="maharashra"; 
	
	public static void main(String[] args) {

		Demo d1 = new Demo();
		System.out.println(d1.state); //maharashra
		
		d1.state="Mumbai";
		
		System.out.println(state); //mumbai
		System.out.println(d1.state); //mumbai
	
		
		Demo d= new Demo();
		
		


	}

}
