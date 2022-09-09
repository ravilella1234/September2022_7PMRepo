package hdfc.loans.carloans;

public class ChildClass implements Rbi
{

	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();
		c.deposit();
		c.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl in ChildClass");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit in ChildClass");
	}

}
