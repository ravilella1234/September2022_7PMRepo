package hdfc.loans.personalloans;

public class TypeCastings 
{

	public static void main(String[] args) 
	{
		// byte-1 , short-2, int-4, long-8, float-4, double-8
		
		// 1-Liter  ---> 500 ML  ---> There is no risk  ---> widening
		// 1-Liter  ---> 1.5 LTR ---> There is a risk(water overflow) --> Narrowing
		
		
		// Type casing from one Primitive data type to another Primitive data type
		
		double d1 =10.7;
		System.out.println(d1);
		
		int d2 = (int)d1;
		System.out.println(d2);
		
		int i1 = 97;
		System.out.println(i1);
		
		char i2 = (char)i1;
		System.out.println(i2);
		
		int j1 = 100;
		System.out.println(j1);
		
		float j2 = (float)j1;
		System.out.println(j2);
		
		
		// Type casing from one Primitive data type to corresponding Wapper Classtype
		
		int x1 = 10;
		System.out.println(x1);
		
		//Integer x2 = x1;
		Integer x2 = Integer.valueOf(x1);
		System.out.println(x2);
		
		Integer y1 = 20;
		System.out.println(y1);
		
		//int y2 = y1;
		int y2 = (int)y1;
		System.out.println(y2);
		
		// Type casing from one Wapper Classtype to another Wapper Classtype
		
		String s1 = "200";
		String s2 = "300";
		
		System.out.println(s1+s2);
		
		float fp1 = Float.parseFloat(s1);
		float fp2 = Float.parseFloat(s2);
		System.out.println(fp1+fp2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		System.out.println(p1+p2);
	}

}
