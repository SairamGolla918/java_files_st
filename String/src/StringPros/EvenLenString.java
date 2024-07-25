package StringPros;

public class EvenLenString  //Java String Program to Print even length words

{
	public static void Evenlen(String s) 
	{
		String[] words = s.split(" ");
		
		for(String word:words)	
		{
			int wordlen = word.length();
			if(wordlen % 2 == 0)
			{
				System.out.print(word+" ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		String str = "good people make day as good day ";
		Evenlen(str);
	}

}
