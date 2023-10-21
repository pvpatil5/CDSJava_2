package pac2;

public class Demo {
	// Only we are concern with our global members. Beacuse they will be static and non static


	static int a =30; // staticglobal
	int b=20; // non static global
	static	String name = "pune";

	public static void test() 
	{

		System.out.println(a);
		System.out.println(name);

		a =25;
		String name="Mumbai";
		System.out.println(a);
		Demo.a=35;
		System.out.println(a);
		System.out.println(name);
		System.out.println("============");


	}

	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println("===========");
		Demo.test();
		System.out.println(a);
	}



}
