package practicejava;

public class NSGlobal 
{

	String name = "TCS";
	int empCount=10000;

	public static void main(String[] args) {

		// If u want to call non static members we have to create object
		// Object Creation Syntax
		
		// Classname referenceName = new ClassName();
		// Demo obj1= new Demo();
		// Sample obj2 = new Sample();
		
		NSGlobal obj1= new NSGlobal ();		
		System.out.println(obj1.name);
		System.out.println(obj1.empCount);
		
	}

}
