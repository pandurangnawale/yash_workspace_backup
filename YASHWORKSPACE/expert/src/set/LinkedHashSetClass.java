package set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * insertion order maintain
 * Duplicates are not allowed
 * We can insert only one null value
 * add & Remove method return type is boolean
 * clear() return tyoe is void
 * 
 * */
public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		System.out.println(lhs.add(1));
		System.out.println(lhs.remove(1));
		System.out.println(lhs.remove(1));
		
		System.out.println(lhs.add(1)); //
		
		System.out.println(lhs);
		
		System.out.println(lhs.add(2));
		System.out.println(lhs.add(4));
		System.out.println(lhs.add(3));
		System.out.println(lhs.add(7));
		System.out.println(lhs.add(5));
		System.out.println(lhs.add(6));
		System.out.println(lhs.add(null));
		System.out.println(lhs.add(null));
		
		System.out.println(lhs);
		
		//lhs.clear();
		
		Integer lhsArray[] = new Integer[lhs.size()];		
		lhs.toArray(lhsArray);		
		for(int i = 0 ; i<lhsArray.length;i++) {
			System.out.print(lhsArray[i]+",");
		}
		
		System.out.println("\n Convert to ArrayList");
		ArrayList<Integer> al = new ArrayList<>(lhs);
		al.stream().forEach((lmdaObj->{
			System.out.print(lmdaObj+",");
		}));
		
		

	}

}
