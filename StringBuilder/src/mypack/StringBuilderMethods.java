package mypack;

public class StringBuilderMethods {

	public static void main(String[] args) 
	{
		String str = "Saiee yadav";
		StringBuilder strbuff = new StringBuilder(str);
		
		System.out.println(strbuff.append("123"));
		System.out.println(strbuff.capacity());
		System.out.println(strbuff.replace(5, 10, "saiee"));
		System.out.println(strbuff.charAt(8));
		System.out.println(strbuff.insert(5, 'e'));
		System.out.println(strbuff.substring(5));
		System.out.println(strbuff.insert(5, "yadav4"));
	}

}
