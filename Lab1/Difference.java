package Lab1;
import java.util.Scanner;
/**
 * 
 * @author GANGWAR
 *
 *
 */

public class Difference 
{
	public int CalculateDifference(int a)
	{
	int sum=0;
	int sum2=0;
	for(int i=1;i<=a;i++)
	{
		sum=sum+(i*i);
		sum2=sum2+i;
	}
	int diff=sum-(sum2*sum2);
	return diff;
	}
	public static void main(String args[])
	{
		Difference s=new Difference();
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=ss.nextInt();
		int b=s.CalculateDifference(a);
		System.out.println("Difference is "+b);
	}
			

}
