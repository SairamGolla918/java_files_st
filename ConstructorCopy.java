public class ConstructorCopy
{
    int id;
    String name;

    ConstructorCopy(int id,String name){
        this.id=id;
        this.name=name;

    }
    ConstructorCopy(ConstructorCopy cd){
        this.id=cd.id;
        this.name=cd.name;

    }
    public String toString(){

        return id+" "+name;
    }
    public static void main(String[] args) {
        ConstructorCopy c= new ConstructorCopy(11,"xyz");
        ConstructorCopy c1= new ConstructorCopy(c);
        System.out.println(c1);
    }
    
}
