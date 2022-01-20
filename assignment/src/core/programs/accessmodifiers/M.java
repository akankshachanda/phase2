package core.programs.accessmodifiers;

public class M {
	private int x=10;
	long y=12345;
	 protected float z=123.45f;
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
}

