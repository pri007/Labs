package Lab10;
interface Verifiable
{
	public boolean authentication(String x,String y);
}

public class Exercise3 
{
	public static void main(String args[])
	{
	Verifiable v=(x,y)->{
		
		if(x.equals("Username")&&y.equals("Password"))
		{
			return true;
		}
		else
		{
			return false;
		}
	};
	System.out.println(v.authentication("Username", "Password"));
	System.out.println(v.authentication("priyesh", "sfdv"));
	System.out.println(v.authentication("Username", "pfj"));
	}
	

}
