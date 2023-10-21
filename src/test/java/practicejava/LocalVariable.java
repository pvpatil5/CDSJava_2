package practicejava;

public class LocalVariable
{
	//global
	long data=555575585855l;
	int pincode=500000;
	String state ="Maha";
	String capital="Mumbai";


	public static void main(String[] args) 
	{

		String name="TCS";
		int empCount=20000;
		int brances=25;
		
		System.out.println(name+empCount+brances);
	}


	public static void testLocal() 
	{	
		//local
		int age=30;
		System.out.println("This is method="+age);
	}


}

