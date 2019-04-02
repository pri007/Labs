package Lab1;

import java.util.Scanner;
/**
 * 
 * @author GANGWAR
 *
 *
 */

public class Power 
{
	public boolean checkNumber(int a)
	{
		int c=0;
		while(a>1)
		{
			if(a%2!=0)
			{
				c=1;
				break;
			}
			a=a/2;
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
		Power s=new Power();
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=ss.nextInt();
		boolean b=s.checkNumber(a);
		if(b==true)
		{
			System.out.println("Number is a power of 2");
		}
		else
		{
			System.out.println("Number is not a power of 2");
		}
	}
}
