package Lab10;
interface Addable
{
	public int add(int x,int y);
}

public class Exercise4 {
	public static int add(int x,int y)
	{
		return x+y;
	}
	public static void main(String args[])
	{
		Addable a=Exercise4::add;
		System.out.println(a.add(5, 6));
	}

}
