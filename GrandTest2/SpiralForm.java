// 5) Write a Java program to display array elements in spiral form ?
// input:
// 1 2 3
// 4 5 6
// 7 8 9
// output:
// 1 2 3 6 9 8 7 4 5



package GrandTest2;


public class SpiralForm 
{
 
    public static void main(String[] args) 
    {
    int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr1.length; i++) 
        {
            for (int j = 0; j < arr1.length; j++) 
            {
            if(i == 1 && j == 2)
                System.out.print(arr1[1][2]+" ");
            else if(i > 1 && j >= 0)
                System.out.print(arr1[i][arr1.length-j-1]+" ");
            else if(i==1 && j < 2)
                continue;
            else
                System.out.print(arr1[i][j]+" ");
            } 
        }
    for (int i = 1; i < 2; i++) 
    {
        for (int j = 0; j <= i ; j++)
        {
            System.out.print(arr1[i][j]+" ");
        }
    }
    
    
    }
}

