package core.programs;


public class multiple {
	 public static void main(String[] args) {  
         
         try{    
              int a[]=new int[5];    
              a[10]=19; 
            
            }
            catch(ArithmeticException e)  
                {  
                 System.out.println(" Exception occurs" +e);  
                }  
         
         catch(Exception e)  
         {  
          System.out.println("Parent Exception occurs");  
         }  
         try{
        	 int b[] = new int[5];
        	 b[6]=9;  
         }
         catch(ArrayIndexOutOfBoundsException e)  
         {  
          System.out.println("ArrayIndexOutOfBounds Exception occurs");  
         }    
         finally{
      	   System.out.println("rest of the code");
         }
         
	 }
}
