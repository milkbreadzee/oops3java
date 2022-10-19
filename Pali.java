import java.io.*;
import java.util.*;

class Pali
{
	public static void main(String args[])
	{
		System.out.println("This is a simple Java program");
		String word = "Helleh";	
		String rev = "";
		char a;
		int l = word.length();
		int n = l-1;
		for(; n>=0; n--)
		{
		    a = word.charAt(n);
			rev = rev + a;
		}
		System.out.println(rev);
		
		if(word.equalsIgnoreCase(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
		
