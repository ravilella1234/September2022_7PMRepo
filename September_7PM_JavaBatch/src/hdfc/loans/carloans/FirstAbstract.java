package hdfc.loans.carloans;

public abstract class FirstAbstract 
{
	
	int x = 100;
	
	public void m1()
	{
		System.out.println("iam m1 in FirstAbstract Class");
	}
	
	public abstract void m2();

	public static void main(String[] args)
	{
		//FirstAbstract obj1 = new FirstAbstract();
				
		FirstAbstract obj;
		
		obj = new Child();
		obj.m1();
		obj.m2();
	}

}
