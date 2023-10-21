package practicejava;

public class Swipe {

	public static void main(String[] args) {
		int a=10;
		
		int b =5;
		System.out.println(a);
		System.out.println(b);
		System.out.println("==================");
		
		//a -->5
		//b -->10
		
		int temp;
		
		temp=a;
		a=b;
		b= temp;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("===========");
		
		String cup1="milk";
		String cup2="tea";
		
		String temp1;
		temp1=cup1;
		
		cup1=cup2;
		cup2=temp1;
		
		
		System.out.println(cup1);
		System.out.println(cup2);
		
		
		
		
		

	}

}
