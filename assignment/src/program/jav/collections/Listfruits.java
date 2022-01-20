package program.jav.collections;
import java.util.*;

class Listfruits {
	public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("orange");
		ts.add("apple");
		ts.add("grapes");
		ts.add("mango");
		ts.add("papaya");
		ts.add("kiwi");
		ts.add("lemon");
		ts.add("pear");
		ts.add("custard");
		ts.add("black grapes");
		System.out.println("is hashset empty  " + ts.isEmpty());
		System.out.println("remove the element "+ts.remove("lemon"));
		System.out.println("remove the element "+ts.remove("kiwi"));
		System.out.println("Size of Hashset is "+ ts.size());
		System.out.println("Does hashset contains this 'orange' element  " + ts.contains("orange"));		
	
		ts.add("pine apple");
		ts.add("rose fruit");
		ts.add("banana");				

}
}
