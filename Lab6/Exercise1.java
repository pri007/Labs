package Lab6;
/**
 * 
 * @author GANGWAR
 *
 *
 */
public class Exercise1 
{
	public static void main(String args[])
	{
		String s="1 2 5 7 93 56 64";
		String a[]=s.split(" ");
		int sum=0;
		for(String b:a)
		{
			System.out.println(b);
			sum=sum+Integer.parseInt(b);
		}
		System.out.println("Sum is "+sum);
	}

}
