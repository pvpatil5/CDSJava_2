package practicejava;

public class Addition {

	int a = 10;
	int b=20;

	public static void main(String[] args) {
		//	test3();

		Addition a1 = new Addition();
		a1.test2();
		
		int c=a1.a+a1.b;
		System.out.println(c);
		
		a1.a=99;
		a1.b=88;
		
		System.out.println(a1.a-a1.b);
		
		

	}

	public void test2() 
	{
		int c=50;
		int d=100;

		System.out.println(c+d);
	}

	public static  void test3() {
		int c=50;
		int d=10;

		System.out.println(c+d);
	}

}
