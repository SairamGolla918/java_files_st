// 3) Write a java program to display three highest elements from given array? 
//  Input: 
//  7 2 4 9 1 6 3 
// Output: 
//  9 7 6 


package GrandTest2;



public class threehighest 
{
    public static void main(String[] args) 
    {
        int  arr[] = {7,2,4 ,9 ,1 ,6, 3 };

       

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
                    
            }
        }
        for(int i = 0 ; i< 3;i++)
        {
            System.out.print(arr[i]+" ");
        }
        

    }
}
