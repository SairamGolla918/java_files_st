package DeadLocks;

public class DeadLockTest 
{

	

	public static void main(String[] args) 
	{
		final String res1 = "saiee";
		final String res2 = "sai";
		
		Thread t1 = new Thread()
				{
					public void run() 
					{
						synchronized (res1) 
						{
							System.out.println("Thread 1: locked  res1");
						
							try {
								Thread.sleep(200);
							} catch (Exception e) {}
							
							synchronized (res2) 
							{
								System.out.println("Thread 1: locked res2");
							}
						}
					}
				};
				
			Thread t2 = new Thread()
				{
					public void run() 
					{
						synchronized (res2) 
						{
							System.out.println("Thread 2: locked  res2");
							
							try {
								Thread.sleep(200);
							} catch (Exception e) {}
							
							synchronized (res1) 
							{
								System.out.println("Thread 2: locked res1");
							}
						}
					}
				};
				
				t1.start();
				t2.start();

	}

}
