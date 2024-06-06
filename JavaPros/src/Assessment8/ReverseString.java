package Assessment8;

class ReverseString 
{
	String Result = "";
	String getReverseString(String name,int index)
	{
		if(index < 0)
		{
			return Result;
		}
		Result = Result + name.charAt(index);
		return getReverseString(name ,index-1);
	}
	public static void main(String[] args) 
	{
		
		ReverseString R = new ReverseString();
		System.out.println(R.getReverseString("Saiee",4));

	}

}

