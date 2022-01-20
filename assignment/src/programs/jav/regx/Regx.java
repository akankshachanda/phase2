package programs.jav.regx;

import java.util.regex.Pattern;

public class Regx {
	
	    public static void main(String args[]) 
	    { 
	    	 System.out.println(Pattern.matches("\\d{12}", "919657894102"));
	    	
	   System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z]*", "SAP564sapl"));
	   System.out.println(Pattern.matches("[a-z]\\.[a-z]*@",  "siri@gmail.com"));  			
	    		        
}
}