package hdfc.loans.collections;

import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(10, 100);
		h.put(200, 200);
		h.put(3, 300);
		h.put(1000, 400);
		h.put(40, 200);
		
		System.out.println(h);
		System.out.println(h.get(30));
		Set<Integer> keys = h.keySet();
		
		for(Integer k:keys)
		System.out.println(k+"--->"+ h.get(k));
	}

}
