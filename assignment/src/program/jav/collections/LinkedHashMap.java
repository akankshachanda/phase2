package program.jav.collections;


import java.util.Map;

public class LinkedHashMap {
public static void main(String[] args) {
        
	Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        
        linkedHashMap.put(1, new String("Sapota"));
        linkedHashMap.put(2, new String("Mango"));
        linkedHashMap.put(3, new String("banana"));
        linkedHashMap.put(4, new String("pear"));
        linkedHashMap.put(5, new String("kiwi"));
        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
        System.out.println("\nLinkedHashMap contains 2 as key? : " + linkedHashMap.containsKey(2));
        System.out.println("LinkedHashMap contains Mango as value? : " + linkedHashMap.containsValue("Mango"));
        System.out.println("\nRemove entry for key 3 : " + linkedHashMap.remove(3));
        System.out.println("Content of LinkedHashMap after removing key 3: " + linkedHashMap);
        System.out.println("Hashcode=" +linkedHashMap.hashCode());
        System.out.println("TreeMap contains  1 as Key? : " +linkedHashMap .containsKey(1));
       
        linkedHashMap.clear();
    
        
    }
}

