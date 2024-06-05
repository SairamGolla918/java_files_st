class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}

class Games
{
    public static void main(String[] args) 
{
        Sports obj1 = new Sports();
        System.out.println(obj1.getName());
        obj1.getNumberOfTeamMembers();
        Soccer obj = new Soccer();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
    }
}