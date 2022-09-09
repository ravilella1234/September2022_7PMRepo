package hdfc.loans.personalloans;

public class VariableTypes 
{
	// primitive Variable
	int x = 100;  // instance (or) non-static (or) instance-global variable
	static String cname = "vmware"; // static (or) static-global variable
	static VariableTypes obj = new VariableTypes();
	
	
	public void m1()
	{
		int x = 200; // local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
	}
	
	public static void m2()
	{
		//VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void main(String[] args) 
	{
		//VariableTypes obj = new VariableTypes(); // non-primitive (or) reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

}
