package com.constructors;

public class Emp {

	String eName;
	int eGrade;
	double eSalary;
	
	public Emp(String n1,int g1,double s1) 
	{
		eName=n1;
		eGrade=g1;
		eSalary=s1;
		System.out.println("Deatails are="+ eName+" "+eGrade+" "+eSalary);
		
	}

	public static void main(String[] args) {
		
		Emp e1 = new Emp("Akshay", 2, 50000.00);
		Emp e2 = new Emp("Pavan", 3, 45000.00);
		
	}

}
