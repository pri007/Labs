package Lab10;
interface Stringable
{
	public String operation(String x);
}

public class Exercise2 
{
	public static void main(String args[])
	{
		Stringable s=(x)->{
			String a="";
			String b=" ";
			for(int i=0;i<x.length();i++)
			{
				a=a+x.charAt(i)+b;
			}
			return a;
		};
		System.out.println(s.operation("CHFDFHHT"));
	}

}
