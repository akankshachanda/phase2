package core.programs;

public class Member_inner {
	//private int data=30;  
	
		void display(){
			System.out.println("i am inside the outer class method");
		}
		 
		class Inner{  		
		 private int data=20;
		  
		  void msg()
		  {
			  Member_inner.this.display();
			  System.out.println("data is "+data);
		  }  
		  void display(){
			  System.out.println("i am inside the inner class method");
		  }
		  class Inner1{
		int value=50;
			void show(){
				System.out.println("value=" +value);
				
			}
		  	  }
		}
	   
		
		public static void main(String args[]){  
		  
		  Member_inner obj=new Member_inner();     // creating object of Outer class
		  
		  Member_inner.Inner in=obj.new Inner();
		 
		  Member_inner.Inner1 in1 = obj.new Inner1();
		  // creating object of Inner class
		  in.msg();  
		  in.display(); 
		 in1.show();
		 }  
		} 


