package core.programs;

public class calculate {
	public int calculate(int a,int b){
	return a+b;
	}
	public int calculate(int r)
	{
		return 3.14*r*r;
	}
	public int calculate (long l,int b){
		return l*b;
	}
	public void show()
	{
		System.out.println("sum=" +a+b);
		System.out.println("area=" +3.14*r*r);
		System.out.println("area=" +l*b);
	}
}