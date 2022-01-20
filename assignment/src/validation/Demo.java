package validation;

import java.util.Scanner;

public class Demo {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your mailid");
		String phone = s.next();
		String regex= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean result  = phone.matches(regex);
		if(result){
			System.out.println("mail id is valid");
		}
		else{
			System.out.println("mail id is not valid");
		}
	}

}

