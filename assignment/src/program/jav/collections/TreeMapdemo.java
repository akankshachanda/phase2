package program.jav.collections;
import java.util.TreeMap;


 class TreeMapdemo {
public static void main(String[] args) {
    	
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        System.out.println("Contents of TreeMap :" +tm);
        
tm.put(1, "apple");
tm.put(2,"papaya");
tm.put(3, "banana");
tm.put(4, "pear");
tm.put(5, "orange");
for(Integer key: tm.keySet()){
	System.out.println(key  +" : "+ tm.get(key));
	System.out.println("TreeMap contains orange as value? : " + tm.containsValue("orange"));
    System.out.println("\nRemove entry for key 3 : " + tm.remove(3));
    System.out.println("Content of LinkedHashMap after removing key 3: " + tm);
    System.out.println("TreeMap contains  1 as Key? : " + tm.containsKey(1));
    System.out.println("TreeMap contains orange as value? : " + tm.containsValue("orange"));
    System.out.println("Hashcode=" +tm.hashCode());
    tm.clear();
}
}
}

