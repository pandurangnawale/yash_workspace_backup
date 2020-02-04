package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(10, "A");
		hm.put(20, "B");
		hm.put(30, "C");
		hm.put(40, "D");
		hm.put(50, "E");
		hm.put(60, "F");
		hm.put(70, "G");
		
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter no ");
		input=sc.nextInt();
		for(Entry entry : hm.entrySet()) {
			
			if((int)entry.getKey() > input) {
				System.out.println(entry.getKey() +"="+entry.getValue());
			}
		} 
		
		Map map=Collections.synchronizedMap(hm);	
	}

}
