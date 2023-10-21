package practicejava;

public class Sample {

	public static void main(String[] args) {
		
		int n1=11;
		int n2=22;
		int n3=33;
		int n4 =4;
		
		n1=n4; // 4
		n4=n2; //22
		n3=n2; //22
		n2=n1; //4
		
		System.out.println(n1);
		System.out.println(n4);
		System.out.println(n3);
		System.out.println(n2);
		
		
		
	}

}
