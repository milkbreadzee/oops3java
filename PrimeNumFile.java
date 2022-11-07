import java.io.*;
import java.util.*;


class PrimeNumFile {
	
int n;

	int inputn(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		n = sc.nextInt();
		return n;
		}
		
		
	boolean isPrime(int a){
		if(a <=1)
			return false;
		for (int i = 2; i < a; i++){
		    if (a % i == 0)
		        return false;
	        }
        return true;
    }
    
    void fwriting() {
    
		try{
		
			FileOutputStream fw = new FileOutputStream("ints.txt");
			DataOutputStream dos = new DataOutputStream(fw);
			
			for(int i= 2; i<=n; i++){
					if(isPrime(i))
						dos.writeInt(i);						
				}
				
			System.out.println("Prime numbers generated...");
			dos.close();
			fw.close();
			}
			
			
			catch(Exception e){
				System.out.println("error..");
				System.out.println(e);
			} 
	}
	
	void freading(){
	
		try{
			int c;
			FileInputStream fr  = new FileInputStream("ints.txt");   
				System.out.println("Displaying prime numbers...");
				while((c =fr.read())!=-1)
				{    
					if(c!=0)
				 		System.out.print(c + " ");    
				}    
		
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("file not found");
			System.out.println(e);
		}
	}
    	
    	
	public static void main(String args[]){
		
		PrimeNumFile obj = new PrimeNumFile();
		
		obj.inputn();
		obj.fwriting();
		obj.freading();
		
	}
}
		
	
	
	
	
	
		
