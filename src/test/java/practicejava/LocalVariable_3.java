package practicejava;

public class LocalVariable_3 {

	static int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		
		System.out.println(a+b);//30
		
	int	a=25;
		b=75;
		
		System.out.println(a+b); //100
		
		test1(); //325
		
//		int a =33;
//		int b=66;
//		System.out.println(a+b);
		
	}
	
	
	
	public static void test1() {
		a=125;
		b=200;
		System.out.println(a+b);
	}
	

}
