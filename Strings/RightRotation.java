// 9) Write a java program to perfor right rotation of a string based on number of characters?
// input:
// string str="ihubtalent";
// cnt=2;
// output:
// ubtalentih

package Strings;

public class RightRotation 
{
    public static void main(String[] args) 
    {
        String str = "ihubtalent";
        int r = 2;
        String res1 = "";
        String res2 = "";
        for (int i = 0; i < str.length(); i++) 
        {
            if(i>=r)
                res1 = res1+str.charAt(i);
            else
                res2 = res2+str.charAt(i);
        }
        System.out.println(res1+res2);
    }
}
