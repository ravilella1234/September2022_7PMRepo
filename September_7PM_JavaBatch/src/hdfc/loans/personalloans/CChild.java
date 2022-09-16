package hdfc.loans.personalloans;
class Parent
{
	public Number workHard()
	{
		System.out.println("PARENT : wakeup early, goto college");
		return 0;
	}
	
	public void care()
	{
		System.out.println("PARENT : atmost care...");
	}
}

public class CChild extends Parent
{
	public strictfp Number workHard()
	{
		System.out.println("CHILD : wakeup anytime, goto movie");
		return 0;
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
