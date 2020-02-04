package set;

import java.util.TreeSet;

/*
 * Set-->AbstractSet-->Navigable->SortedSet->TreeSet
 * Duplicates are not allowed
 * Null not allowed
 * add element in sorted format
 * TreeSet does not allowed Heterogeneous data // diff data type not allowed
 * TreeSet is not Synchronized 
 * first() method return min element
 * last() method return max element
 * By Default TreeSet is Natural Sorting order
 * TreeSet use Comparable to sorting byDefault
 * */
public class TreeSetClass {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(1);
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(7);
		ts.add(5);
		ts.add(6);		
		ts.add(4);
		//ts.add(null);
		ts.add(3);		
		ts.add(8);
		
		System.out.println(ts);
		
		ts.first();
		ts.last(); 
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		
		ts=ts1;
		
		System.out.println(ts1.comparator());

	}

}
