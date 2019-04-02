package Lab10;
interface Factorial
{
	public int calculatefact(int x);
	
}
class Reference
{
	public static int Facti(int x)
	{
		int f=1;
		for(int i=1;i<=x;i++)
		{
			f=f*i;
		}
		return f;
	}
}
public class Exercise5 
{
	public static void main(String args[])
	{
	Factorial ff=Reference::Facti;
	System.out.println(ff.calculatefact(6));
	}
}
