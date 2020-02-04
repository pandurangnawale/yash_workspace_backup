package map;

import java.util.LinkedHashMap;

/*
 * Map->HashMap->LinkedHashMap
 * Diff is ony it maintain Insertion order 
 * because it is use doubly linked list
 * */
public class LinkedHashMapClass {

	public static void main(String args[]) {
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		
		lhm.put(1, 1);
		lhm.put(3, 3);
		lhm.put(5, 5);
		lhm.put(2, 2);
		lhm.put(2, 4);
		lhm.put(6, 6);
		lhm.put(7, 7);
		lhm.put(null,null);
		lhm.put(null,1);
		lhm.put(1,null);
		
		lhm.entrySet().forEach(entry->{
			System.out.println(entry.getKey() +" : "+entry.getValue());
		});
		
		//System.out.println(lhm);
		
		lhm.entrySet().forEach(entry->{
			System.out.println(entry.getKey() +":"+entry.getValue());
		});		
	}
	
}
