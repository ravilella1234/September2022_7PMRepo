package hdfc.loans.carloans;

import java.util.Date;

import hdfc.loans.personalloans.C;

public class A 
{
	public static  int x = 10;
	
	public  void m1()
	{
		x = 100;
		System.out.println("iam m1 from A");
	}
	
	public static void m5()
	{
		System.out.println("iam m5 static");
	}
		
	static
	{
		System.out.println("iam static block...");
	}
	
	static
	{
		Date d = new Date();
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		
		A obj = new C();
		obj.m1();
		
		//C obj1 = new A();
		
		A.m5();
	}

}
