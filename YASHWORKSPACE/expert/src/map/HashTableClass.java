package map;

import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(1, "A");
		ht.put(2, "B");
		//ht.put(null, "C");
		//ht.put(3, null);
		
		System.out.println(ht);
		
	}

}
