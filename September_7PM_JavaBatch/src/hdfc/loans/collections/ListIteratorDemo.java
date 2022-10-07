package hdfc.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("oaktech");
		a.add("durga");
		a.add("vmware");
		a.add("prolifics");
		
		System.out.println(a);
		
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(var.equals("durga"))
				val.set("Rythu Polam");
			else
				val.remove();
		}
		System.out.println(a);
	}

}
