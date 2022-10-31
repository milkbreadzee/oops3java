import java.io.*;
import java.util.*;

class FileException{
	public static void main (String args[]) throws IOException, FileNotFoundException{
		
        Scanner sc = new Scanner(System.in);
		String s;

		try{
    
		FileOutputStream fw = new FileOutputStream("test.txt");

		System.out.println("enter :");
		//String s =  "Hello World!";
        s = sc.nextLine();
		byte b[] = s.getBytes();                                                                                                                                                                                                                                                                
		fw.write(b);
		System.out.println("Done..");
		fw.close();
		}
		catch(Exception e){
			System.out.println("error..");
			System.out.println(e);
		} 

		try{
		int c;
		FileInputStream fr  = new FileInputStream("test.txt");   
		while((c =fr.read())!=-1){    
		 System.out.print((char)c);    
		}    
		fr.close();}
		catch(FileNotFoundException fe){
			System.out.println("file not found");
			System.out.println(fe);
		}
	}
}