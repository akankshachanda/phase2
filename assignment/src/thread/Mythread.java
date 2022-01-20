package thread;

public class Mythread extends Thread {
	public void run()
	{
	 System.out.println("concurrent thread started running..");
	}
}
public static void main( String args[] )
{
 MyThread mt = new MyThread();
 mt.start();
}
