package practicejava;

public class Subtract {

	int a =30;
	int b= 40;
	static int d=100;
	static int e =200;
	public static void main(String[] args) {

		Subtract s1 = new Subtract();
		System.out.println(s1.a+s1.b);
		System.out.println("static output="+(d+e));

		d=2;
		e=3;
		System.out.println("static output="+(d+e));
		
		
		Subtract s2 = new Subtract();
		s2.a=1000;
		s2.b=3000;
		
		System.out.println(s2.a+s2.b);
		
		System.out.println(s1.a+s1.b);
		
	}

}
