package hdfc.loans.carloans;

public class Child extends FirstAbstract
{

	public static void main(String[] args) 
	{		
				
		 Child c = new Child();
		 c.m1();
		 c.m2();
	}

	@Override
	public void m2() {
		System.out.println("iam overriden m2 in Child");
	}

}
