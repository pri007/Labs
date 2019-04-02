package Lab9;
/**
 * 
 * @author GANGWAR
 *
 *
 */

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//in cachedtrhread pool it will create new thread=no.of request but will first check no of free thraeds in availabel different pools and
//first assign them and rest create new thread
//fixedthreadpool size is fixed

public class Threaddemoexecuter 
{
	public static void main(String args[])
	{
		Runnable r=new Runnable() {
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
			}
		};
		ExecutorService e=Executors.newFixedThreadPool(5);
		ExecutorService e1=Executors.newCachedThreadPool();
		Executor e3=Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++)
		{
			e.execute(r);
			System.out.println("a");
			//e1.execute(r);
		}
		
		//System.out.println("\n\n");
		for(int i=0;i<10;i++)
		{
			System.out.println("b");
			//e.execute(r);
			e1.execute(r);
		}
		System.out.println("\n\n");
		for(int i=0;i<10;i++)
		{
			System.out.println("c");
			//e.execute(r);
			e3.execute(r);
		}
	}

}
