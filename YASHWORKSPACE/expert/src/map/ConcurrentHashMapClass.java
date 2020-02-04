package map;

import java.util.concurrent.ConcurrentHashMap;

/*
 * Object->AbstractMap->ConcurrentHashMap
 * ConcurrentHashMap is non-synchronized.
 * Its default concurrent level is 16.
 * every thread put lock on segment at time of insertion, updating and removing but we can access or get element at the same time 
 * It means it will not put lock on get
 * Can not insert null key and value
 * Duplicate key not allowed
 * Does not maintain insertion order
 * Duplicate key not allowed. It override exiting data to new data
 * Insertion order not maintain
 * */

public class ConcurrentHashMapClass {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		
		chm.put(1, "A");
		// chm.put(null, "B");
		//chm.put(2, null);
		chm.put(1, "B");
		chm.put(3, "C");
		chm.put(4, "C");
		chm.put(5, "C");
		chm.put(8, "C");
		chm.put(9, "C");
		chm.put(7, "C");
		chm.put(6, "C");
		
		
		System.out.println(chm);
		
	}

}
