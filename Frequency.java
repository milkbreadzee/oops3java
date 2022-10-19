import java.io.*;
import java.util.*;

class Frequency{
	public static void main(String args[])
	{
		int a, i, j ,test;
		
		char [] arr = new char[50];		
		int [] freq = new int[50];	
		
		
		String word ="";
		String words = "hello world";
		
		int l = words.length();
		
			
		for( i  = 0; i<l ; i++){
			 word = words.replace(" " , "");
			}
			
		int length = word.length();
		
		word = word.toLowerCase();
		
		
		for( i=0,a = 97;a<=122; i++,a++)
		{
				
				//System.out.println(i); //debug
				
			for(j =0; j<length; j++){
			
				test = word.charAt(j);
				
				if(test==a )
				{
						freq[i]++;
						
						arr[i] = word.charAt(j);
				
				
						//if(test == 108)
							//System.out.println("hi0"); //debug
						
						
					//	System.out.println(word.charAt(j)); //debug
					
					
					
						//System.out.println(freq[i]); //debug
					}
					
				
			}
			
			
			
		}
		int size = freq.length;
		
		for(i = 0;i<size ; i++)
		{
			if(freq[i]!=0){
			System.out.print(arr[i] + ":");
				System.out.println(freq[i]);
				
		}
	
	
		}
		
		
		}
	}
