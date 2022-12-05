class Tctf {
   public static void main(String args[])throws ArithmeticException {
     //try block 
     try{  
            System.out.println("::Try block::");
            int num=67/0;  
            System.out.println(num);  
      }  
      //catch block
      catch(ArithmeticException e){
          System.out.println("::Catch block::");
         System.out.println(e);
      }  
      catch(Exception e){
      	System.out.println(e);
      }
      //finally block
      finally{
          System.out.println("::Finally block::");
      }  
      System.out.println("outside try catch anf finally");  
   }   
}
