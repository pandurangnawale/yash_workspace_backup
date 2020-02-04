package list;

import java.util.ArrayList;
import java.util.Vector;
/*Same as arrayList 
 * insertion order maintain
 * duplicates are allowed
 * insert null value and get null value
 * */
public class VectorClass {

	public static void main(String[] args) {
		
		Vector<String> vc = new Vector<>();
		vc.add("A");
		vc.add("A");
		vc.add("B");
		vc.add("D");
		vc.add("C");
		vc.add("G");
		vc.add("E");
		vc.add(null);
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("A");
		al.add(null);
		System.out.println(al.get(1));
		
		System.out.println(vc.get(vc.size()-1));
		
		System.out.println(""+vc);

	}

}
