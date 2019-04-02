package Lab7;
/**
 * 
 * @author GANGWAR
 *
 *
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise1 
{
	public ArrayList<String> getValues(HashMap<Integer,String> h)
	{
		Collection<String> k=h.values();
		//Set<Integer> i=h.keySet();	
		//Set<String> f=h.values() not allowed because values can be duplicate
		ArrayList<String> a1=new ArrayList<String>(k);
		Collections.sort(a1);
		return a1;
		
	}
	public static void main(String args[])
	{
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(5, "Rohit");
		m.put(7, "Amit");
		m.put(1, "zain");
		m.put(9, "Bobby");
		//System.out.println(m);
		Exercise1 e=new Exercise1();
		ArrayList<String> g=e.getValues(m);
		System.out.println(g);
	}
}
