package programs.jav.serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Employee {

		 public static void main(String args[]) throws IOException 
		  {
			 Employee1 emp1 = new Employee1 (10 , 30, "sri" ,"IT" ,63210, 'f' );
			 Employee2 emp2 = new Employee2 (20 , 40, "siri" ,"IT" ,63220, 'f' );
			    
		    FileOutputStream fos= null;
		    ObjectOutputStream oos= null;
		    
		    try{ 
		      fos = new FileOutputStream("C:\\Users\\dell\\Desktop\\writers\\employee.ser"); 
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(emp1);
		      oos.writeObject(emp2);
		      System.out.println("Serialzation Done!!");
		   }catch(IOException ioe){
		      System.out.println(ioe);
		    }
		    finally{
			      oos.close();
			      fos.close();

	}
		    Employee1 o=null;
		    Employee2 o1=null;
	try{
	    FileInputStream fis = new FileInputStream("C:\\Users\\dell\\Desktop\\writers\\employee.ser");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    o = (Employee1)ois.readObject();
	    o1 = (Employee2)ois.readObject();
	    ois.close();
	    fis.close();
	  }
	  catch(IOException ioe)
	  {
	     ioe.printStackTrace();
	     return;
	  }catch(ClassNotFoundException cnfe)
	   {
	     System.out.println("Student Class is not found.");
	     cnfe.printStackTrace();
	     return;
	   }
	  System.out.println("Emp1 Name:"+emp1.getname());
	  System.out.println("Emp1 Age:"+emp1.getage());
	  System.out.println("Emp1 id:"+emp1.getid());
	  System.out.println("Emp1 deptname:"+emp1.getdeptname());
	  System.out.println("Emp1 contact:"+emp1.getcontact());
	  System.out.println("Emp1 gendet:"+emp1.getgender());
	  
	  System.out.println("Emp2 Name:"+emp2.getname());
	  System.out.println("Emp2 Age:"+emp2.getage());
	  System.out.println("Emp2 id:"+emp2.getid());
	  System.out.println("Emp2 deptname:"+emp2.getdeptname());
	  System.out.println("Emp2 contact:"+emp2.getcontact());
	  System.out.println("Emp2 gender:"+emp2.getgender());
	  
	}
		  }
	class Employee1 implements java.io.Serializable{
		  
		  private int id;
		  private int age;
		  private  String name;
		  private String deptname;  
		  private  int contact;
		  private char gender;        //
		  
		  public Employee1(int id, int age, String name,String deptname, int contact , char gender) {
		    this.id = id;
		    this.age = age;
		    this.name = name;
		    this.deptname = deptname;
		    this.contact = contact;
		    this.gender=gender;
		  }
		  public int getage() {
			    return age;
			  }
			  public void setage(int age) {
			    this.age = age;
			  }
			  public String getdeptname() {
				    return deptname;
				  }
			  public void setdeptname(String deptname) {
			    this.deptname = deptname;
			  }
			  public String getname(){
				  return name;
			  }
			  public void setname(String deptname) {
			    this.name = name;
			  }
			
			  public char getgender() {
			    return gender;
			  }
			  public void setgender( char gender) {
				    this.gender= gender;
				  }
			  public int getid(){
				  return id;
			  }
			  public void setid(int id) {
				    this.id = id;
				  }
			  public int getcontact(){
				  return contact;
			  }
			  public void setcontact(int contact) {
				    this.contact = contact;
				  }
	}
	class Employee2 implements java.io.Serializable{
		  
		  private int id;
		  private int age;
		  private  String name;
		  private String deptname;  
		  private  int contact;
		  private char gender;        //
		  
		  public Employee2(int id, int age, String name,String deptname, int contact , char gender) {
		    this.id = id;
		    this.age = age;
		    this.name = name;
		    this.deptname = deptname;
		    this.contact = contact;
		    this.gender=gender;
		  }
		  
		  public int getage() {
			    return age;
			  }
			  public void setage(int age) {
			    this.age = age;
			  }
			  public String getdeptname() {
				    return deptname;
				  }
			  public void setdeptname(String deptname) {
			    this.deptname = deptname;
			  } public String getname() {
				    return name;
				  }
			  public void setname(String deptname) {
			    this.name = name;
			  }
			  public char getgender() {
			    return gender;
			  }
			  public void setgender( char gender) {
				    this.gender= gender;
				  }
			  public int getid(){
				  return id;
			  }
			  public void setid(int id) {
				    this.id = id;
				  }
			  public int getcontact(){
				  return contact;
			  }
			  public void setcontact(int contact) {
				    this.contact = contact;
				  }
	
		  
	}






