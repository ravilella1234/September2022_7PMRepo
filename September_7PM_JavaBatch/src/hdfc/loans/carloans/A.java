package hdfc.loans.carloans;

import hdfc.loans.personalloans.C;

public class A 
{
	public void m1()
	{
		System.out.println("iam m1 from A");
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		
		A obj = new C();
		obj.m1();
		
		//C obj1 = new A();
	}

}
