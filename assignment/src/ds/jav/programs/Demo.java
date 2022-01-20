package ds.jav.programs;
import java.util.*;
import java.io.*;

public class Demo {
	 public static void main(String[] args) 
	 {
		 Stack  stack1 = new Stack();
		
	 stack1.push("apple");
     stack1.push("Grapes"); 
     stack1.push("Almond"); 
     stack1.push("pear"); 
     stack1.push("papaya"); 
     stack1.push("guntur"); 
     stack1.push("vij"); 
     stack1.push("hyd"); 
     stack1.push("pdrl"); 
     stack1.push("a");
     stack1.push("b"); 
     stack1.push("c"); 
     stack1.push("d"); 
     stack1.push('A'); 
     stack1.push('B'); 
  
     System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("apple"));
     System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("vij"));
     stack1.pop(); 
     stack1.pop(); 
     stack1.pop(); 
     stack1.pop(); 
  
     System.out.println(stack1); 
   
     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 
     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.poll()); 
  

    
      
 }  
  
     
 }


