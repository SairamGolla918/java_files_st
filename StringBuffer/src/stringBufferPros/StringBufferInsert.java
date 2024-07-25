package stringBufferPros;

public class StringBufferInsert {

	public static void main(String[] args) 
	{
		
		StringBuffer strbuff = new StringBuffer("Saiee yadav");
		
		System.out.println(strbuff.append("123"));
		System.out.println(strbuff.capacity());
		System.out.println(strbuff.replace(5, 10, "saiee"));
		System.out.println(strbuff.charAt(8));
		System.out.println(strbuff.insert(5, 'e'));
		System.out.println(strbuff.substring(5));
		System.out.println(strbuff.insert(5, "yadav4"));
	}

}
