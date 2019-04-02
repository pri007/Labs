package Lab10;

interface operationable
{
	public int power(int x,int y);
}
public class Exercise1 
{
	public static void main(String args[])
	{
	operationable o=(x,y)->{int result=1;
	while(y!=0)
	{
		result*=x;
		--y;
	}
	return result;
		};
		System.out.println(o.power(3,4));
	}
		
}
