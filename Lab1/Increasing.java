package Lab1;

import java.util.Scanner;
/**
 * 
 * @author GANGWAR
 *
 *
 */
public class Increasing 
{
	public boolean increasingorder(int a)
	{
		int c=0;
		while(a!=0)
		{
			int rem=a%10;
			a=a/10;
			int rem2=a%10;
			if(rem>=rem2)
			{
				c=0;
			}
			else
			{
				c=1;
				break;
			}
		}
		if(c==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Increasing s=new Increasing();
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=ss.nextInt();
		boolean b=s.increasingorder(a);
		if(b==true)
		{
			System.out.println("Number in increasing order");
		}
		else
		{
			System.out.println("Number is not in increasing order");
		}
	}

}
