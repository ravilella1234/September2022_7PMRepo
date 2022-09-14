package hdfc.loans.personalloans;
class Parent
{
	public void workHard()
	{
		System.out.println("PARENT : wakeup early, goto college");
	}
	
	public void care()
	{
		System.out.println("PARENT : atmost care...");
	}
}

public class CChild extends Parent
{
	public void workHard()
	{
		System.out.println("CHILD : wakeup anytime, goto movie");
	}
	
	public void love()
	{
		System.out.println("CHILD : iam i love...");
	}

	public static void main(String[] args) 
	{
		CChild obj = new CChild();
		obj.workHard();
		obj.care();
		obj.love();
	}

}
