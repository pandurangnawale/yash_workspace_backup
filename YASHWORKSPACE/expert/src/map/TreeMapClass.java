package map;

import java.util.TreeMap;

/*
 *Duplicate key not allowed
 *if key is duplicate it override exiting value to new value
 *sorting based on key 
 * 
 * */

public class TreeMapClass {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(4, "A");
		tm.put(3, "C");
		tm.put(5, "E");
		tm.put(2, "H");
		tm.put(6, "K");
		tm.put(7, "K");
		tm.put(7, "P");
		
		System.out.println(tm);
		
	}

}
