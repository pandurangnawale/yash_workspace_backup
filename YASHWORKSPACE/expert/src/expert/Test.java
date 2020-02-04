package expert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

class Test 
{
	
	private  final int a=5;
	
	
	
	public static void main (String[] args)
	{
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(null);
		
		//System.out.println(al);
		
		/*for (int i = 1; i <= 5; i++) {
			System.out.println(i +" % 5 = "+i%5);
		}*/
		
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(10);
		ll.add(null);
		//System.out.println(ll);
		//System.out.println(ll.get(2));
		
		
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 1);
		hm.put(2, 2);
		hm.put(1, 3);
		hm.put(3, 1);
		
		System.out.println(hm);
	}
}


