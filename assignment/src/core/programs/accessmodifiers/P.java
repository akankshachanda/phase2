package core.programs.accessmodifiers;

public class P {
	 private void privatemethod()
	 {
		 System.out.println("private method");
	 }
	 void defaultmethod(){
		 System.out.println("default method");
	 }
	 protected void protectedmethod(){
		 System.out.println("protected method");
	 }
	 public void publicmethod(){
		 System.out.println("public method");
	 }
   public static void main(String args[]){
	M objM = new M();
	N objN = new N();
	 System.out.println("long variable of M=" +objM.y);
	  System.out.println("float variable of M=" +objM.z);
	  System.out.println("int variable of N=" +objN.x);
	  System.out.println("double variable of N=" +objN.z);
	  
}

}
