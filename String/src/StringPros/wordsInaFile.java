package StringPros;

import java.util.Arrays;

public class wordsInaFile {
	
	static void noOfwords(String S)
	{
		String strArr[] = S.split(" ");
		System.out.println("no Of words In a File : "+strArr.length);
	}

	public static void main(String[] args) {
		
		String S = "1 write a program using string tokenizers 2 Java program to find the duplicate characters in a string 3 Java program to find the duplicate words in a string 4 Java Program to find the frequency of characters 5 Java Program to find the largest and smallest word in a string  6 Java Program to find the most repeated word in a text file 7 Java Program to find the number of the words in the given text file" ;
		noOfwords(S);
	}

}

