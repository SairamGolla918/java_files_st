package GrandTest;

public class SynchronizatioN extends Thread
{
	public synchronized void run()
	{
		for(int i = 0;i<4;i++ )
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) 
	{
		SynchronizatioN obj = new SynchronizatioN();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
}
