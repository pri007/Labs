package Lab1;
import java.util.*;
/**
 * 
 * @author GANGWAR
 *
 *
 */
public class Sum 
{
	public int calculateSum(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Sum s=new Sum();
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=ss.nextInt();
		int b=s.calculateSum(a);
		System.out.println("Sum Of natural Numbers divided by 3 or 5  in this range is "+b);
		
	}
}
