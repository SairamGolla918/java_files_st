package StringPros;

public class LargeAndSmallWord {

	void Large(String S)
	{
		String strArr[] = S.split(" ");
		String LargeWord = strArr[0];
		for (int i = 0; i < strArr.length; i++)
		{	
			if((LargeWord.length()) < (strArr[i].length()))
			{
				LargeWord = strArr[i];
			}	
		}
		System.out.println("LargeWord : "+LargeWord);
	}
	void Small(String S)
	{
		String strArr[] = S.split(" ");
		String SmallWord = strArr[0];
		for (int i = 0; i < strArr.length; i++)
		{	
			if((SmallWord.length()) > (strArr[i].length()))
			{
				SmallWord = strArr[i];
			}	
		}
		System.out.println("SmallWord : "+SmallWord);
	}
	public static void main(String[] args)
	{
		String str = "java is a pure object oriented programming langueage";
		
		LargeAndSmallWord obj = new LargeAndSmallWord();
		obj.Large(str);
		obj.Small(str);
	}

}
