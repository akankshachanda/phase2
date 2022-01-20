package P1;
import java.io.IOException;
import java.io.FileWriter;

public class FileAppend {
	public static void main(String args[]){
		String data = "data is appended";
		try{
			FileWriter output= new FileWriter("C:\\Users\\dell\\Desktop\\writers\\employee.txt" , true);
			output.write(data);
			System.out.println("data is successfully appended ");
			output.close();
		}
		catch(IOException ex){
System.out.println("File appended error");
			
		}
		}
	}

