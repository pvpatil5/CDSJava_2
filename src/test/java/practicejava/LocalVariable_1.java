package practicejava;

public class LocalVariable_1 {

	//Declaration
	static String name="Infy";
	static String city="Blr";
	
	public static void main(String[] args) 
	{
		System.out.println(name);
		System.out.println(city);
		
		test2();
		
		
	}
	
	public static void test1() {
		name="IBM";	
		city= "pune";
		System.out.println(name);
		System.out.println(city);
		
	}
	
	public static void test2() {
		name="TCS";	
		city= "MUMBAI";
		System.out.println(name);
		System.out.println(city);
		
	}
	

}
