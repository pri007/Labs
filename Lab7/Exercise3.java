package Lab7;
/**
 * 
 * @author GANGWAR
 *
 *
 */
import java.util.HashMap;

public class Exercise3 
{
	public HashMap<Integer,Integer> getSquares(int[] a)
	{
		HashMap<Integer,Integer> b=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			int j=i*i;
			b.put(i,j);
		}
		return b;
	}
	public static void main(String args[]) 
	{
		int[] a= {1,2,3,4,5};
		HashMap<Integer,Integer> c=new HashMap<Integer,Integer>();
		Exercise3 rr=new Exercise3();
		c=rr.getSquares(a);
		System.out.println(c);
		
	}

}
