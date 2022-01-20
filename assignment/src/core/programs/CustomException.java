package core.programs;



public class CustomException {
	static void validate(int salary) throws InvalidsalaryException {
		if(salary<2100)
				 throw new InvalidsalaryException("you need to work hard");  
			     else if(salary>=2100 && salary<=5000 )  
		 throw new InvalidsalaryException  ("your salary is somehow good"); 
			     else if (salary>5100 && salary<9000)
			     System.out.println("your salary is good");
			   }  
			     
			   public static void main(String args[]){  
			      try{  
			        validate(2500);  
			      }
			      catch(Exception m)
			      {
			    	  System.out.println("Exception occured: "+ m.getMessage());
			      }  
			  
			      System.out.println("rest of the code...");  
			  
		
	}

}
class InvalidsalaryException extends Exception{
	InvalidsalaryException(String s){  //2
		  super(s);  
		 }  
	}  


	