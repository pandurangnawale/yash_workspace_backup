package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Set-->AbstractSet->HashSet-> (Cloneable,Serializable)
 * Duplicates Valures are not allowed
 * Only one null value accepted
 * insertion order not maintain
 * HashSet is not synchronized
 * Add method return type is boolean. it return true false.
 * 
 */


public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet(5); //The constructore define initial capacity of hashSet is 5
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		System.out.println("SIZE "+hs.size());
		
		hs.forEach(lmd1 ->{
			if(lmd1.equals(1)) {
				System.out.println("IF CHK "+lmd1);				
			}
			
			System.out.println(lmd1);
		});
		
		System.out.println("CONTAINS "+hs.contains(2));
		
		//convert hasSet to Array
		System.out.println("Converted into array");
		Integer hsArray[] = new Integer[hs.size()];
		hs.toArray(hsArray);		
		for(int i=0;i<hsArray.length;i++) {
			System.out.println(hsArray[i]);
		}
		
		//convert HashSet to ArrayList
		
		System.out.println("Converting into ArrayList");
		List<Integer> al = new ArrayList<>();
		
		al=hs.stream().collect(Collectors.toList());
		
		System.out.println(al);
		
		hs.clear();		
		
			
	}
	
}
