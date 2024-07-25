package GrandTest;



public class LoopPattern {

	public static void main(String[] args) 
	{
		
		int n = 4;
		
			for (int j = 0; j <= n; j++) 
			{
				for (int i = n; i > j; i--) 
				{
	                System.out.print("  ");
	            }
				
				for (int k = 0; k < 2*j-1; k++) 
				{
					
					System.out.print("* ");
					
				}
				System.out.println();
			}
			for (int j = n-1; j >=1  ; j--) 
			{
				for (int i = n; i > j; i--) 
				{
	                System.out.print("  ");
	            }
				for (int k = 0; k < 2*j-1; k++) 
				{
					
					System.out.print("* ");
					
				}
				System.out.println();
			}
	
	}

}
