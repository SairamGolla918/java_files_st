import java.util.Scanner;

class Variables 
{

    int Var = 10; // Global Variable
    int saiee_var()
    {
        int Var1 = Var * 10; // Local variable
        System.out.println("Variables:");
        return Var1; // Return Statement
    } 
    
    public static void main(String[] args)
    {
        Variables obj = new Variables();
        int i= obj.saiee_var();
        System.out.println(i);
    }
    //Variables obj1 = new Variables();
     //invoking  
}
class DataTypes
{ 
    void saiee_datatype()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println((byte)num);
        System.out.println((short)num);
        System.out.println((long)num);
        System.out.println((float)num);
        System.out.println((double)num);
        System.out.println((int)num);
        System.out.println((char)num);
        System.out.println(num);
        sc.close();
    }
    public static void main(String[] args){
        DataTypes obj1 = new DataTypes();
        obj1.saiee_datatype();
    }
   
}

class ConditionalStatements

{
    String ConStates1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1 or 0");
        int day = sc.nextInt();
        String result = "";
        if (day == 0)
            result =  "False";
        else if(day == 1)
            result =  "True";
        //sc.close();
        return result;
    }  
        
    String ConStates2()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int var = sc.nextInt();
        String result = "";
        switch (var)
        {
            case 1 :result = "Monday";break; 
            case 2 :result = "Tuesday";break;
            case 3 :result = "Wednesday";break;
            case 4 :result = "Thursday";break;
            case 5 :result = "Friday";break;
            case 6 :result = "Saturday";break;
            case 7 :result = "Sunday";break; 
              
            default:
                break;

            
        }
        
        return result; 
        
    }
    public static void main(String[] args) 
    {
        ConditionalStatements obj = new ConditionalStatements();
        String str = obj.ConStates1();
        System.out.println(str);
        String str1 = obj.ConStates2();
        System.out.println(str1);

    }
    
}
