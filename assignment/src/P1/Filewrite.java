package P1;
import java.io.FileWriter;
import java.io.IOException;
public class Filewrite {
	public static void main(String args[]){
		String data ="101, siri, Guntur, India";
		try{
			FileWriter output= new FileWriter("C:\\Users\\dell\\Desktop\\writers\\employee.txt");
			output.write(data);
			System.out.println("data is written ");
			output.close();
		}
		catch(IOException ex){
			System.out.println("File write error");	
		}
	}

}
