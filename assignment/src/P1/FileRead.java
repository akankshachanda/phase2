package P1;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {
	public static void main(String args[]){
		char[] data = new char[100];
		try{
		FileReader input =new FileReader("C:\\Users\\dell\\Desktop\\writers\\employee.txt");
		input.read(data);
		System.out.println("data is received from a file");
		System.out.println(data );
		input.close();
		}
		catch(IOException ex){
			System.out.println("File read error");
			
		}
	}
}
