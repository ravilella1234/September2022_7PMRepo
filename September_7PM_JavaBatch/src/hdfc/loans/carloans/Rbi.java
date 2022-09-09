package hdfc.loans.carloans;

public interface Rbi 
{
	
	int x = 100;
	
	public void withdrawl(); // abstract behaviuors
	public void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i = new Rbi();
		
		
		Rbi i;
		
		i = new ChildClass();
		i.deposit();
		i.withdrawl();
		
		i = new Icici();
		i.deposit();
		i.withdrawl();
		
		i = new Kotak();
		i.deposit();
		i.withdrawl();
	}

}
