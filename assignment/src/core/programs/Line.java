package core.programs;

public class Line {
	synchronized public void getLine()                     
	{
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try
			{
				Thread.sleep(400);   //0.4 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
}
}
class Hr extends Thread
{
	// reference to Line's Object.
	Line line;

	Hr(Line line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}
class Finance extends Thread
{
	// reference to Line's Object.
	Line line;

	Finance(Line line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}
class It extends Thread
{
	// reference to Line's Object.
	Line line;

	It(Line line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}
 class Test
{
	public static void main(String[] args)
	{
		// Object of Line class that is shared among the threads.
		Line obj = new Line();
		Hr hr=new Hr(obj);
		Finance f = new Finance(obj);
		It i =new It(obj);
		hr.setName("Hr");
		f.setName("Finance");
		i.setName("IT");
		hr.start();
		i.start();
		f.start();
}
	}