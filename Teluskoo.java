
public class Teluskoo {

    int i = 10;
    int saiee()
    {   
        i = i * 10;
        
        return i;
    }
    public static void main(String[] args)
    {   
        Teluskoo obj = new Teluskoo();
        int obj1 = obj.saiee();
        System.out.println(obj1);
        //obj.saiee();
    }
}
