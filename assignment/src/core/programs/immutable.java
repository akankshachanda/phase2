package core.programs;

public class immutable {
	public static void main(String args[]){
		String t= "Delhi";
		String o="Mumbai";
		String k="delhi";
		String y= new String ("Mumbai");
		String l=new String ("delhi");
		String p=new String("Hello");
		
		   if(t.equals(l))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   if(t.equals(k))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
	}

}
