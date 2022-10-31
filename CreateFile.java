 import java.io.*;


class CreateFile{
	public static void main (String args[]) throws IOException 
	{ 
			
		
		    FileWriter fw = new FileWriter("text.txt");
			String s =  "Hello World!";
			for(int i = 0; i<s.length(); i++){
				char j = s.charAt(i);
				//System.out.println(j);
				fw.write(j);
			}

			System.out.println("Done...");
			fw.close();

				int c;
				FileReader fr  = new FileReader("text.txt"); ;
		
		//catch(FileNotFoundException Fe){
		//	System.out.println("File Not Found");
		//	}
				while((c = fr.read())!= -1)
						System.out.print((char)c);
		fr.close();
				
						

				
				
		}
		
		//catch(FileNotFoundException e){
		//	System.out.println("an error has occoured");
		//	e.printStackTrace();

//		}
		//catch(IOException e){
		//	System.out.println("an error has occoured");
		//	e.printStackTrace();

		//}
		
	}

