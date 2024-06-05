package ourpack;

public interface Second 
{
	void show();
	default void display()
	{
		System.out.println("second");
	}
}
