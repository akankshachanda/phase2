package core.programs.accessmodifiers;

public class N {
	public int x=10;
	protected long y=12345;
	 double z=123.45f;
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
