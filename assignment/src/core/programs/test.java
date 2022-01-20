package core.programs;

public class test {
	public static void main(String args[]){
		calculate c1= new calculate ();
		c1.calculate(10,15);
		calculate c2= new calculate ();
		c2.calculate(10);
		calculate c3= new calculate ();
		c3.calculate(20,15);
		c1.show();
		c2.show();
		c3.show();
		
	}
}
