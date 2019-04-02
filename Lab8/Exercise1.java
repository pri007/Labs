package Lab8;
/**
 * 
 * @author GANGWAR
 *
 *
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Mythread extends Thread
{
	public void run() 
	{
		System.out.println("10 Character are copied");
		
	}
}

public class Exercise1 
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		Mythread t1=new Mythread();
			FileWriter fw=new FileWriter("d:\\FORMAT\\newfile3.txt");
		FileReader fr=new FileReader("d:\\FORMAT\\newfile.txt");
		int b=0;
		int count=0;
	while((b=fr.read())!=-1) 
		{
		System.out.println((char)b);
		fw.write(b);
		count++;
		if(count==10)
		{
			Thread.sleep(5000);
			t1.run();
			count=0;
		}
		}
		fw.close();
		
		
		
	}

}
