package program.jav.collections;

import java.util.*;

class Fruitslist {
public static void main(String[] args){
		 
		 LinkedHashSet<String> hs = new LinkedHashSet<String>();
			
			hs.add("orange");
			hs.add("apple");
			hs.add("grapes");
			hs.add("mango");
			hs.add("papaya");
			hs.add("kiwi");
			hs.add("lemon");
			hs.add("pear");
			hs.add("custard");
			hs.add("black grapes");
			System.out.println("is hashset empty  " + hs.isEmpty());
			System.out.println("remove the element "+hs.remove("lemon"));
			System.out.println("remove the element "+hs.remove("kiwi"));
			System.out.println("Size of Hashset is "+ hs.size());
			System.out.println("Does hashset contains this 'orange' element  " + hs.contains("orange"));		
		hs.add("pine apple");
		hs.add("rose fruit");
		hs.add("banana");
		
}
}
