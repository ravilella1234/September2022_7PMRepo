package hdfc.loans.personalloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		String s3 = "Ravikanth";
		System.out.println(s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));

		String s4 = "ravi";
		System.out.println(s4);
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.contains(s4));
		
		String s5 = "Ravikanth";
		System.out.println(s5);
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		String s6 = "ravi";
		System.out.println(s6);
		System.out.println(s5.contains(s6));
		System.out.println(s5.toLowerCase().contains(s6));
		
		String s7 = "rajdeep";
		String s8 = "aj";
		System.out.println(s7.contains(s8));
		
		String s9 = "raviKanth";
		System.out.println(s9);
		System.out.println(s9.substring(2, 7));
		
		System.out.println(s5);
		System.out.println(s9);
		System.out.println(s5.contains(s9.substring(2, 7)));
		System.out.println(s5.contains(s9.substring(2, 7).toLowerCase()));
		
		System.out.println(s1);
		System.out.println(s2);
		
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1);
		String s10 = " ravikanth";
		System.out.println(s10);
		System.out.println(s1.equals(s10));
		System.out.println(s1.equals(s10.trim()));
		
		String s11 = "amar akbar antony";
		System.out.println(s11);
		String[] str = s11.split(" ");
		System.out.println(str.length);
		for(String s:str)
		{
			System.out.println(s);
		}
		
		System.out.println(s1);
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.endsWith("kanth"));
		
		System.out.println(s1);
		System.out.println(s1.replace('r', 'k'));
	}

}
