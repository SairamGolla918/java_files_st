package mypack;

public class StringMethods 
{
	public static void main(String[] args)
	{
		String str1 = "Sai Ram Golla";
		String str3 = "sai ram golla";
		String str2 = new String("Sai Ram Golla");
		char a[] = {'1','a','b','a','a'};
		
		System.out.println("charAt " + str1.charAt(7));//Returns the char value at the specified index.
		System.out.println("charAt "+ str2.charAt(7));//Returns the char value at the specified index.
		System.out.println("codePointAt "+str1.codePointAt(1));//Returns the character (Unicode code point) at the specified index.
		System.out.println("codePointAt "+str2.codePointAt(1));//Returns the character (Unicode code point) at the specified index.
		System.out.println("codePointBefore "+str1.codePointBefore(1));//Returns the character (Unicode code point) before the specified index.
		System.out.println("codePointBefore "+str2.codePointBefore(1));//Returns the character (Unicode code point) before the specified index.
		System.out.println("codePointCount "+str1.codePointCount(0,5));// Returns the number of Unicode code points in the specified text range of this String.
		System.out.println("codePointCount "+str2.codePointCount(0,5));// Returns the number of Unicode code points in the specified text range of this String.
		System.out.println("compareTo " + str1.compareTo(str2));//Compares two strings lexicographically.
		System.out.println("compareToIgnoreCase "+str1.compareToIgnoreCase(str2));//Compares two strings lexicographically, ignoring case differences.
		System.out.println("contains "+str1.contains("Sai"));//Returns true if and only if this string contains the specified sequence of char values.
		System.out.println("contentEquals "+str1.contentEquals(str2));//Compares this string to the specified CharSequence.
		System.out.println(String.copyValueOf(a));//a String that contains the characters of the character array.
		System.out.println(String.copyValueOf(a, 0, 5));//a String that contains the characters of the specified subarray of the character array.
		System.out.println(str1.endsWith("av"));//Tests if this string ends with the specified suffix.
		System.out.println(str2.endsWith("a "));//Tests if this string ends with the specified suffix.
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));//Compares this String to another String, ignoring case considerations.
		
	}
}
