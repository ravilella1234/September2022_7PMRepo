package hdfc.loans.personalloans;

import hdfc.loans.carloans.A;
import hdfc.loans.carloans.B;

public class C extends A
{
	public void m1()
	{
		System.out.println("iam overriden m1 from C");
	}
	
	public void m3()
	{
		System.out.println("iam m3 from C");
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m2();
		b.m1();
		
		C c = new C();
		c.m3();
		c.m1();
		
		
	}

}
